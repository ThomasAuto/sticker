package cn.xiaoyanol.sticker.controller;

import cn.xiaoyanol.sticker.core.ResponseJson;
import cn.xiaoyanol.sticker.domain.User;
import cn.xiaoyanol.sticker.exception.ServiceException;
import cn.xiaoyanol.sticker.service.IUserService;
import cn.xiaoyanol.sticker.utils.JsonUtils;
import cn.xiaoyanol.sticker.vo.UserVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;


    /**
     * 获取用户基本信息
     * @param openId
     * @return
     * @throws ServiceException
     */
    @GetMapping("/info/{openId}")
    public ResponseJson getUserInfo(@PathVariable String openId) throws ServiceException {
        ResponseJson responseJson = new ResponseJson();

        User user = userService.queryUserByOpenId(openId);
        responseJson.setData(user);

        return responseJson;
    }

    /**
     * 注册用户
     * @param userVO
     * @return
     * @throws ServiceException
     */
    @PostMapping("/register")
    public ResponseJson registerUser(@RequestBody UserVO userVO) throws ServiceException {
        ResponseJson responseJson = new ResponseJson();
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        userService.addUser(user);
        logger.info("添加用户成功：{}", JsonUtils.objectToJsonString(user));
        return responseJson;
    }
}
