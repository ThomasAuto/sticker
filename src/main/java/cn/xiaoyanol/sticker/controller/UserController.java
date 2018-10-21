package cn.xiaoyanol.sticker.controller;

import cn.xiaoyanol.sticker.core.ResponseJson;
import cn.xiaoyanol.sticker.domain.User;
import cn.xiaoyanol.sticker.exception.ServiceException;
import cn.xiaoyanol.sticker.service.IUserService;
import cn.xiaoyanol.sticker.utils.JsonUtils;
import cn.xiaoyanol.sticker.vo.OpenIdVO;
import cn.xiaoyanol.sticker.vo.UserVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private RestTemplate restTemplate;


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

    /**
     * 登录
     * @param code
     * @return
     * @throws ServiceException
     */
    @GetMapping("/login")
    public ResponseJson login(@RequestParam String code) throws ServiceException {
        ResponseJson responseJson = new ResponseJson();
        // 小程序密钥
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid= TODO &secret= TODO &js_code=JSCODE&grant_type=authorization_code";
        try {
            if (StringUtils.isEmpty(code)) {
                responseJson.setCode(0);
                responseJson.setMsg("code 为空");
            } else {
                // 发起GET请求获取凭证
                WX_URL=WX_URL.replace("JSCODE", code);
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                HttpEntity<String> entity = new HttpEntity<String>(headers);
                String res = restTemplate.exchange(WX_URL, HttpMethod.GET, entity, String.class).getBody();
                OpenIdVO openIdVO = JsonUtils.jsonStringToObject(res, OpenIdVO.class);
                String openId = openIdVO.getOpenid();
                User user = userService.queryUserByOpenId(openId);

                user = user == null ? new User() :  user;
                HashMap<String , Object> map = new HashMap<>();
                map.put("user", user);
                map.put("openId", openId);
                map.put("sessionKey", openIdVO.getSession_key());
                responseJson.setData(map);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return responseJson;
    }
}
