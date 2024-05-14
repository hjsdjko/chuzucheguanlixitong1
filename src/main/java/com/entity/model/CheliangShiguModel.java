package com.entity.model;

import com.entity.CheliangShiguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆事故
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangShiguModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆
     */
    private Integer cheliangId;


    /**
     * 事故编号
     */
    private String cheliangShiguUuidNumber;


    /**
     * 事故名称
     */
    private String cheliangShiguName;


    /**
     * 事故相关文件
     */
    private String cheliangShiguFile;


    /**
     * 事故详情
     */
    private String cheliangShiguContent;


    /**
     * 发生事故时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangShiguTime;


    /**
     * 处理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangShiguChuliTime;


    /**
     * 保险
     */
    private Integer cheliangShiguBaoxianTypes;


    /**
     * 责任方
     */
    private Integer cheliangShiguZerenTypes;


    /**
     * 处理结果
     */
    private String cheliangShiguChulijieguoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }


    /**
	 * 设置：车辆
	 */
    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 获取：事故编号
	 */
    public String getCheliangShiguUuidNumber() {
        return cheliangShiguUuidNumber;
    }


    /**
	 * 设置：事故编号
	 */
    public void setCheliangShiguUuidNumber(String cheliangShiguUuidNumber) {
        this.cheliangShiguUuidNumber = cheliangShiguUuidNumber;
    }
    /**
	 * 获取：事故名称
	 */
    public String getCheliangShiguName() {
        return cheliangShiguName;
    }


    /**
	 * 设置：事故名称
	 */
    public void setCheliangShiguName(String cheliangShiguName) {
        this.cheliangShiguName = cheliangShiguName;
    }
    /**
	 * 获取：事故相关文件
	 */
    public String getCheliangShiguFile() {
        return cheliangShiguFile;
    }


    /**
	 * 设置：事故相关文件
	 */
    public void setCheliangShiguFile(String cheliangShiguFile) {
        this.cheliangShiguFile = cheliangShiguFile;
    }
    /**
	 * 获取：事故详情
	 */
    public String getCheliangShiguContent() {
        return cheliangShiguContent;
    }


    /**
	 * 设置：事故详情
	 */
    public void setCheliangShiguContent(String cheliangShiguContent) {
        this.cheliangShiguContent = cheliangShiguContent;
    }
    /**
	 * 获取：发生事故时间
	 */
    public Date getCheliangShiguTime() {
        return cheliangShiguTime;
    }


    /**
	 * 设置：发生事故时间
	 */
    public void setCheliangShiguTime(Date cheliangShiguTime) {
        this.cheliangShiguTime = cheliangShiguTime;
    }
    /**
	 * 获取：处理时间
	 */
    public Date getCheliangShiguChuliTime() {
        return cheliangShiguChuliTime;
    }


    /**
	 * 设置：处理时间
	 */
    public void setCheliangShiguChuliTime(Date cheliangShiguChuliTime) {
        this.cheliangShiguChuliTime = cheliangShiguChuliTime;
    }
    /**
	 * 获取：保险
	 */
    public Integer getCheliangShiguBaoxianTypes() {
        return cheliangShiguBaoxianTypes;
    }


    /**
	 * 设置：保险
	 */
    public void setCheliangShiguBaoxianTypes(Integer cheliangShiguBaoxianTypes) {
        this.cheliangShiguBaoxianTypes = cheliangShiguBaoxianTypes;
    }
    /**
	 * 获取：责任方
	 */
    public Integer getCheliangShiguZerenTypes() {
        return cheliangShiguZerenTypes;
    }


    /**
	 * 设置：责任方
	 */
    public void setCheliangShiguZerenTypes(Integer cheliangShiguZerenTypes) {
        this.cheliangShiguZerenTypes = cheliangShiguZerenTypes;
    }
    /**
	 * 获取：处理结果
	 */
    public String getCheliangShiguChulijieguoContent() {
        return cheliangShiguChulijieguoContent;
    }


    /**
	 * 设置：处理结果
	 */
    public void setCheliangShiguChulijieguoContent(String cheliangShiguChulijieguoContent) {
        this.cheliangShiguChulijieguoContent = cheliangShiguChulijieguoContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
