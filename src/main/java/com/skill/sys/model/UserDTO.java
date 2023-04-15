package com.skill.sys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 接收前端登录请求的参数
 */
@Data
public class UserDTO {

    private Integer id;
    private String username;
    private String password;
    private String token;
}
