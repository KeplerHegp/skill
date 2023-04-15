package com.skill.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skill.common.util.TokenUtils;
import com.skill.sys.entity.User;
import com.skill.sys.mapper.UserMapper;
import com.skill.sys.model.UserDTO;
import com.skill.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglei
 * @since 2023-04-08
 */
@Service
@Transactional
//public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
//
//}
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Map<String,Object> login(UserDTO userDTO){
        // 根据用户名和密码查询
        Map<String, Object> map = new HashMap<>();
        map.put("username", userDTO.getUsername());
        map.put("password", userDTO.getPassword());
        User loginUser = userMapper.selectLoginOne(map);
        //结果不为空，则生成token，并将用户信息存入redis
        if(loginUser != null){
            BeanUtil.copyProperties(loginUser,userDTO,true);//把loginUser里的信息往userDTO复制
            //设置Token
            String token = TokenUtils.genToken(loginUser.getId().toString(), loginUser.getPassword());
            userDTO.setToken(token);
            Map<String, Object> data = new HashMap<>();
            data.put("token",token);
            return data;
        }
        return null;
    }

}
