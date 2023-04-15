package com.skill.sys.service;


import com.skill.common.util.PageUtils;
import com.skill.sys.entity.Jobs;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skill.sys.model.JobsQueryDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张蕾
 * @since 2023-04-08
 */
public interface IJobsService extends IService<Jobs> {
    PageUtils queryPage(JobsQueryDTO queryDTO);

    void saveRole(Jobs data);
    void update(Jobs data);
    void deleteBatch(Long[] Ids);
}
