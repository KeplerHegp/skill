package com.skill.sys.controller;


import com.skill.common.result.Result;
import com.skill.sys.model.UserDTO;
import com.skill.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhanglei
 * @since 2023-04-08
 */
@RestController
@RequestMapping("/sys/user")
@CrossOrigin  //跨域
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
//    @RequestBody可以将User类的转换成json
    public Result<Map<String,Object>> login(@RequestBody UserDTO userDTO) {
        Map<String, Object> data = userService.login(userDTO);

        if (data != null) {
            return Result.success(data);
        }
        return Result.fail(20002,"用户名或密码错误");
    }

}
