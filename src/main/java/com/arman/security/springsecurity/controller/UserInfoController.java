package com.arman.security.springsecurity.controller;

import com.arman.security.springsecurity.model.UserInfo;
import com.arman.security.springsecurity.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserInfoController {
    @Autowired
    private UserInfoService service;

    @PostMapping("/create")
    public String createUser(@RequestBody UserInfo userInfo){
        return service.createUser(userInfo);
    }
}
