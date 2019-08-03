package com.zzh.service.impl;

import com.zzh.api.IUserService;
import com.zzh.api.dto.UserDTO;
import com.zzh.repository.mapper.UserMapper;
import com.zzh.repository.po.UserPO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/8/1
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserByUserCode(String userCode) {
        UserDTO userDTO = new UserDTO();
        UserPO userPO = userMapper.selectOne(UserPO.createQueryOfUserCode(userCode));
        BeanUtils.copyProperties(userPO, userDTO);
        return userDTO;
    }
}
