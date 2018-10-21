package cn.xiaoyanol.sticker.service.impl;

import cn.xiaoyanol.sticker.dao.IUserDAO;
import cn.xiaoyanol.sticker.domain.User;
import cn.xiaoyanol.sticker.domain.UserExample;
import cn.xiaoyanol.sticker.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public int addUser(User user) {
        User u = queryUserByOpenId(user.getOpenId());
        if (u != null){
            return 0;
        }
        return userDAO.insertSelective(user);
    }

    @Override
    public User queryUserByOpenId(String openId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        List<User> users = userDAO.selectByExample(example);
        return users.size() == 0  ? null : users.get(0);
    }
}
