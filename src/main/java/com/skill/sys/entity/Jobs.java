package com.skill.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张蕾
 * @since 2023-04-08
 */
@Getter
@Setter
@TableName(value = "jobs")
@ApiModel(value = "Jobs对象", description = "")
@ToString
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("公司名称")
    private String comName;

    @ApiModelProperty("招聘岗位")
    private String comPost;

    @ApiModelProperty("薪资")
    private String comSalary;

    @ApiModelProperty("地址")
    private String comAddress;

    @ApiModelProperty("工作经验")
    private String comExperience;

    @ApiModelProperty("学历")
    private String comEducation;

//    @ApiModelProperty("公司性质")
//    private String comNature;
//
//    @ApiModelProperty("公司人数")
//    private String comNumpeople;
//
//    @ApiModelProperty("公司类型")
//    private String comType;
//
//    @ApiModelProperty("公司标签")
//    private String comTag;
//
//    @ApiModelProperty("公司详情")
//    private String comDetails;
//
//    @ApiModelProperty("数据来源")
//    private String comSource;
//
//    @ApiModelProperty("职位技能")
//    private String jobRequest;

    @ApiModelProperty("技能词")
    private String jobRequestseg;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public String getComName() {
//        return comname;
//    }
//
//    public void setComname(String comname) {
//        this.comname = comname;
//    }
//    public String getCompost() {
//        return compost;
//    }
//
//    public void setCompost(String compost) {
//        this.compost = compost;
//    }
//    public String getComsalary() {
//        return comsalary;
//    }
//
//    public void setComsalary(String comsalary) {
//        this.comsalary = comsalary;
//    }
//    public String getComaddress() {
//        return comaddress;
//    }
//
//    public void setComaddress(String comaddress) {
//        this.comaddress = comaddress;
//    }
//    public String getComexperience() {
//        return comexperience;
//    }
//
//    public void setComexperience(String comexperience) {
//        this.comexperience = comexperience;
//    }
//    public String getComeducation() {
//        return comeducation;
//    }
//
//    public void setComeducation(String comeducation) {
//        this.comeducation = comeducation;
//    }
//    public String getComnature() {
//        return comnature;
//    }
//
//    public void setComnature(String comnature) {
//        this.comnature = comnature;
//    }
//    public String getComnumpeople() {
//        return comnumpeople;
//    }
//
//    public void setComnumpeople(String comnumpeople) {
//        this.comnumpeople = comnumpeople;
//    }
//    public String getComtype() {
//        return comtype;
//    }
//
//    public void setComtype(String comtype) {
//        this.comtype = comtype;
//    }
//    public String getComtag() {
//        return comtag;
//    }
//
//    public void setComtag(String comtag) {
//        this.comtag = comtag;
//    }
//    public String getComdetails() {
//        return comdetails;
//    }
//
//    public void setComdetails(String comdetails) {
//        this.comdetails = comdetails;
//    }
//    public String getComsource() {
//        return comsource;
//    }
//
//    public void setComsource(String comsource) {
//        this.comsource = comsource;
//    }
//    public String getJobrequest() {
//        return jobrequest;
//    }
//
//    public void setJobrequest(String jobrequest) {
//        this.jobrequest = jobrequest;
//    }
//    public String getJobrequestseg() {
//        return jobrequestseg;
//    }
//
//    public void setJobrequestseg(String jobrequestseg) {
//        this.jobrequestseg = jobrequestseg;
//    }
//
//    @Override
//    public String toString() {
//        return "Jobs{" +
//            "id=" + id +
//            ", comname=" + comname +
//            ", compost=" + compost +
//            ", comsalary=" + comsalary +
//            ", comaddress=" + comaddress +
//            ", comexperience=" + comexperience +
//            ", comeducation=" + comeducation +
//            ", comnature=" + comnature +
//            ", comnumpeople=" + comnumpeople +
//            ", comtype=" + comtype +
//            ", comtag=" + comtag +
//            ", comdetails=" + comdetails +
//            ", comsource=" + comsource +
//            ", jobrequest=" + jobrequest +
//            ", jobrequestseg=" + jobrequestseg +
//        "}";
//    }
}
