package com.skill.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skill.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglei
 * @since 2023-04-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


        User selectLoginOne(Map<String, Object> map);
}
