package com.skill.sys.model;

import com.skill.common.model.PageDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JobsQueryDTO extends PageDTO {
    @ApiModelProperty("公司名称")
    private String comName;

//    @ApiModelProperty("招聘岗位")
//    private String comPost;
//
//    @ApiModelProperty("薪资")
//    private String comSalary;
//
//    @ApiModelProperty("学历")
//    private String comeDucation;
//
//    @ApiModelProperty("公司类型")
//    private String comType;
//
//    @ApiModelProperty("职位技能")
//    private String jobRequest;
}
