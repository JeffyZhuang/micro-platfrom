package com.zzh.api;

import com.zzh.api.dto.UserDTO;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/8/1
 */
public interface IUserService {
    UserDTO getUserByUserCode(String userCode);
}
