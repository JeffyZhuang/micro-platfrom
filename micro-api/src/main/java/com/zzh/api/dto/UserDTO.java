package com.zzh.api.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/8/1
 */
@Data
public class UserDTO {

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码加密串
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 手机号码
     */
    private String telephone;

    /**
     * 是否激活
     */
    private String status;

    /**
     * 有效、失效
     */
    private String disabled;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;
}
