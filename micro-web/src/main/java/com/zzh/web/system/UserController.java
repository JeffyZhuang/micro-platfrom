package com.zzh.web.system;

import com.zzh.api.IUserService;
import com.zzh.web.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzh
 * @Description: 用户Controller
 * @Date: 2019/8/1
 */
@RestController
@Api(value = "用户服务")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @ApiOperation(value = "获取用户信息")
    @GetMapping("/user")
    public UserVO test(@RequestParam(name = "userCode") String userCode) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(iUserService.getUserByUserCode(userCode), userVO);
        return userVO;
    }

}
