package cn.xiaoyanol.sticker.service;

import cn.xiaoyanol.sticker.domain.Sticker;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2018-11-01
 * @Time: 下午12:52
 */
public interface IStickerService {

    /**
     * 根据用户信息查询记录
     * @param userId
     * @return
     */
    List<Sticker> queryStickersByUserId(Integer userId);

    /**
     * 添加一笔
     * @param sticker
     * @return
     */
    int add(Sticker sticker);
}
