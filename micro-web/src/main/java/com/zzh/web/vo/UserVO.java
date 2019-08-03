package com.zzh.web.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户VO
 * @Author zzh
 * @Date 2019/8/3 15:43
 **/
@Data
@ApiModel
public class UserVO {

    @ApiModelProperty("用户code")
    private String userCode;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码加密串")
    private String password;
}
