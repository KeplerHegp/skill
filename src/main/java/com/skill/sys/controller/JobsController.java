package com.skill.sys.controller;

import com.skill.common.model.PageDTO;
import com.skill.common.util.PageUtils;
import com.skill.sys.entity.Jobs;
import com.skill.sys.model.JobsQueryDTO;

import com.skill.sys.service.IJobsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张蕾
 * @since 2023-04-08
 */
@Api(tags = "岗位信息",value = "Jobs")
@RestController
@RequestMapping("/sys/jobs")
public class JobsController {
    @Autowired
    private IJobsService jobsService;

    @ApiOperation(value = "查询岗位信息", notes = "查询岗位信息")
    @GetMapping("/list")
    public List<Jobs> list() { return jobsService.list(); }
//    public PageUtils list(@ApiParam(value = "查询的条件") JobsQueryDTO queryDTO){
//        return jobsService.queryPage(queryDTO);
//    }
}