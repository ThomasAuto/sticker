package cn.xiaoyanol.sticker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xiaoyanol.sticker.dao")
public class StickerApplication {


    public static void main(String[] args) {
        SpringApplication.run(StickerApplication.class, args);
    }
}