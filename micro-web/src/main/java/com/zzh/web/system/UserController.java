package com.zzh.web.system;

import com.zzh.ApiInfo;
import com.zzh.api.IUserService;
import com.zzh.web.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Api(tags = ApiInfo.System.USER_SERVICE)
public class UserController {
    @Autowired
    private IUserService iUserService;

    @ApiOperation(ApiInfo.System.User.GET_USER)
    @GetMapping("/user")
    public UserVO test(@RequestParam(name = "userCode") String userCode) {
        UserVO userVO = new UserVO();
        log.info("this is a info");
        log.warn("this is a warn");
        log.debug("this is a debug");
        log.error("this is a error");
        BeanUtils.copyProperties(iUserService.getUserByUserCode(userCode), userVO);
        return userVO;
    }

}
