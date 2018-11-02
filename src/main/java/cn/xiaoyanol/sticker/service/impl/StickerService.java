package cn.xiaoyanol.sticker.service.impl;

import cn.xiaoyanol.sticker.dao.IStickerDAO;
import cn.xiaoyanol.sticker.domain.Sticker;
import cn.xiaoyanol.sticker.domain.StickerExample;
import cn.xiaoyanol.sticker.service.IStickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午12:57
 */
@Service
public class StickerService implements IStickerService {

    @Autowired
    private IStickerDAO stickerDAO;


    @Override
    public List<Sticker> queryStickersByUserId(Integer userId) {

        StickerExample example = new StickerExample();
        StickerExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return stickerDAO.selectByExample(example);

    }

    @Override
    public int add(Sticker sticker) {

        return stickerDAO.insertSelective(sticker);
    }
}
