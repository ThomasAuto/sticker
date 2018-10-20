package cn.xiaoyanol.sticker.controller;

import cn.xiaoyanol.sticker.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private IUserDAO stickerUserDAO;
    @GetMapping("/t")
    public Object test() {
        stickerUserDAO.selectByPrimaryKey(1);
        return "hello world";
    }
}
