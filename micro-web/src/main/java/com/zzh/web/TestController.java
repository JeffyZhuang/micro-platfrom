package com.zzh.web;

import com.zzh.api.IUserService;
import com.zzh.api.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/8/1
 */
@RestController
public class TestController {
    @Autowired
    private IUserService iUserService;


    @GetMapping("/user")
    public UserDTO test() {
        return iUserService.getUserByUserCode("1");
    }

}
