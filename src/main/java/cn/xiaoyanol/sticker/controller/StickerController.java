package cn.xiaoyanol.sticker.controller;

import cn.xiaoyanol.sticker.core.ResponseJson;
import cn.xiaoyanol.sticker.dao.IUserDAO;
import cn.xiaoyanol.sticker.domain.Sticker;
import cn.xiaoyanol.sticker.domain.User;
import cn.xiaoyanol.sticker.exception.ServiceException;
import cn.xiaoyanol.sticker.service.IStickerService;
import cn.xiaoyanol.sticker.service.IUserService;
import cn.xiaoyanol.sticker.utils.MoneyUtils;
import cn.xiaoyanol.sticker.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/sticker")
public class StickerController {


    private static final Logger logger = LoggerFactory.getLogger(StickerController.class);


    @Autowired
    private IStickerService stickerService;

    @Autowired
    private IUserService userService;

    /**
     * 查询用户记录
     * @param recordQueryVO
     * @return
     * @throws ServiceException
     */
    @PostMapping("/record")
    public ResponseJson getUserRecord(@RequestBody RecordQueryVO recordQueryVO) throws ServiceException, ParseException {

        ResponseJson responseJson = ResponseJson.getSuccessResponseJson();
        if (StringUtils.isEmpty(recordQueryVO.getOpenId())) {
            return responseJson;
        }

        User user = userService.queryUserByOpenId(recordQueryVO.getOpenId());

        // 查询记录
        List<Sticker> stickers = stickerService.queryStickersByUserId(user.getId());

        // 排序数据
        Collections.sort(stickers, new Comparator<Sticker>() {
            @Override
            public int compare(Sticker o1, Sticker o2) {
                return (int) (o1.getUsedTime().getTime() - o2.getUsedTime().getTime());
            }
        });
        // 处理时间格式 -- 数据格式处理
        MoneyStickerVO preSticker = null;
        RecordVO recordVO = new RecordVO();
        List<RecordDayVO> recordDayVOList = new ArrayList<>();
        RecordDayVO recordDayVO = new RecordDayVO();

        List<MoneyStickerVO> list = new ArrayList<>();


        for (Sticker sticker : stickers) {
            Date usedTime = sticker.getUsedTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(usedTime);
            Date parse = sdf.parse(format);
            sticker.setUsedTime(parse);

            MoneyStickerVO moneyStickerVO = new MoneyStickerVO();
            BeanUtils.copyProperties(sticker, moneyStickerVO);
            if (preSticker == null) {
                list.add(moneyStickerVO);
                recordDayVOList.add(recordDayVO);
                recordDayVO.setCost(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                recordDayVO.setIncome(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                recordDayVO.setStickerList(list);
                recordDayVO.setTime(sticker.getUsedTime());
                preSticker = moneyStickerVO;
            }else if (preSticker.getUsedTime().getTime() == sticker.getUsedTime().getTime()) {
                list.add(moneyStickerVO);
                recordDayVO.setCost(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                recordDayVO.setIncome(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                preSticker = moneyStickerVO;
            }else {
                list = new ArrayList<>();
                recordDayVO = new RecordDayVO();
                recordDayVOList.add(recordDayVO);
                recordDayVO.setStickerList(list);
                list.add(moneyStickerVO);
                recordDayVO.setCost(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                recordDayVO.setIncome(MoneyUtils.convertCentToYuan(sticker.getAmount()));
                recordDayVO.setTime(sticker.getUsedTime());
                preSticker = moneyStickerVO;
            }
        }

        // 计算总花费
        int inAll = 0;
        int outAll = 0;
        for (RecordDayVO rdv : recordDayVOList) {
            List<MoneyStickerVO> stickerList = rdv.getStickerList();
            int in = 0;
            int out = 0;
            for (MoneyStickerVO s : stickerList) {
                if (Integer.parseInt(s.getAmount()) < 0) {
                    out += Integer.parseInt(s.getAmount()) * 100;
                }else {
                    in += Integer.parseInt(s.getAmount()) * 100;
                }
            }
            rdv.setCost(MoneyUtils.convertCentToYuan(out));
            rdv.setIncome(MoneyUtils.convertCentToYuan(in));
            outAll +=out;
            inAll +=in;
        }

        Collections.sort(recordDayVOList, new Comparator<RecordDayVO>() {
            @Override
            public int compare(RecordDayVO o1, RecordDayVO o2) {
                return (int) (o2.getTime().getTime() - o1.getTime().getTime());
            }
        });

        recordVO.setIncome(MoneyUtils.convertCentToYuan(inAll));
        recordVO.setCost(MoneyUtils.convertCentToYuan(-outAll));
        recordVO.setRecordDayVOS(recordDayVOList);
        responseJson.setData(recordVO);
        return responseJson;
    }


    /**
     * 添加一笔
     * @param stickerVO
     * @return
     * @throws ServiceException
     */
    @PostMapping("/add")
    public ResponseJson addRecord(@RequestBody StickerVO stickerVO) throws ServiceException {
        ResponseJson responseJson = ResponseJson.getSuccessResponseJson();

        if (stickerVO.getAmount() == null || stickerVO.getUserId() == null || stickerVO.getAmount() == 0) {
            return responseJson;
        }

        Sticker sticker = new Sticker();
        sticker.setUserId(stickerVO.getUserId());
        // 金额按分处理
        sticker.setAmount(stickerVO.getAmount().intValue() * 100);
        sticker.setUsedTime(new Date());
        sticker.setContent(stickerVO.getContent());
        //如果是支出 设置为负数
        if (stickerVO.getOutFlag()){
            sticker.setAmount(-sticker.getAmount());
        }

        stickerService.add(sticker);

        return responseJson;
    }
}
