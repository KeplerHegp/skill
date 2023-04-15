package com.skill.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skill.sys.entity.User;
import com.skill.sys.model.UserDTO;

import java.util.Map;

public interface UserService extends IService<User> {

    Map<String, Object> login(UserDTO userDTO);
}
