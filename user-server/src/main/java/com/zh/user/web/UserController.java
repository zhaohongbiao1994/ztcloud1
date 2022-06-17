package com.zh.user.web;


import com.zh.user.config.ConfigPropertiesPattern;
import com.zh.user.config.ConfigPropertiesZtcloud;
import com.zh.user.pojo.User;
import com.zh.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

/*    @Value("${pattern.deteformat}")
    private String dateformat;
    @Value("${pattern.name}")
    private String name;*/

    @Autowired
    private ConfigPropertiesPattern configPattern;
    @Autowired
    private ConfigPropertiesZtcloud ztcloud;
/*    @Autowired
    private PatternProperties properties;*/

 /*   @GetMapping("prop")
    public PatternProperties properties() {
        return properties;
    }*/

    @GetMapping("now")
    public String now() {
        System.out.println(configPattern.getDeteformat111());
        System.out.println(configPattern.getName());
        System.out.println(ztcloud.getHong());
        System.out.println(ztcloud.getZhb1());
        System.out.println(ztcloud.getBiao());
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(configPattern.getDeteformat111()));
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth: " + truth);
        return userService.queryById(id);
    }
}
