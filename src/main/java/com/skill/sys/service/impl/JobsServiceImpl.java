package com.skill.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skill.common.util.PageUtils;
import com.skill.sys.entity.Jobs;
import com.skill.sys.mapper.JobsMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skill.sys.model.JobsQueryDTO;
import com.skill.sys.service.IJobsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张蕾
 * @since 2023-04-08
 */
@Service
public class JobsServiceImpl extends ServiceImpl<JobsMapper, Jobs> implements IJobsService {

    @Override
    public PageUtils queryPage(JobsQueryDTO queryDTO) {
        QueryWrapper<Jobs> wrapper = new QueryWrapper<Jobs>().like(
                StringUtils.isNotEmpty(queryDTO.getComName()),"comName",queryDTO.getComName()
        );
        Page<Jobs> page = this.page(queryDTO.page(),wrapper);
        return new PageUtils(page);
    }

    @Override
    public void saveRole(Jobs data) {

    }

    @Override
    public void update(Jobs data) {

    }

    @Override
    public void deleteBatch(Long[] Ids) {

    }
}
