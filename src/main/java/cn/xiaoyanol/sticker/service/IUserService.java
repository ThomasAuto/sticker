package cn.xiaoyanol.sticker.service;

import cn.xiaoyanol.sticker.domain.User;

public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    User queryUserByOpenId(String openId);


}
