package com.lanpin.helloworld.controller;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    private User user;

    @GetMapping("/index")
    @ResponseBody
    public String showIndex(){
        return "hello world";
    }

    @GetMapping("/number")
    public void showNumber(){
        logger.info("开始计算");
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            try {
                logger.info("开始睡眠");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                logger.debug("出现bug");
            }
        }

    }

}
