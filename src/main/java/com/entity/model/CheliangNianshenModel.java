package com.entity.model;

import com.entity.CheliangNianshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆年审
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangNianshenModel implements Serializable {
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
     * 年审编号
     */
    private String cheliangNianshenUuidNumber;


    /**
     * 年审名称
     */
    private String cheliangNianshenName;


    /**
     * 年审文件
     */
    private String cheliangNianshenFile;


    /**
     * 年审时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangNianshenTime;


    /**
     * 年审详情
     */
    private String cheliangNianshenContent;


    /**
     * 年审结果
     */
    private Integer cheliangNianshenTypes;


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
	 * 获取：年审编号
	 */
    public String getCheliangNianshenUuidNumber() {
        return cheliangNianshenUuidNumber;
    }


    /**
	 * 设置：年审编号
	 */
    public void setCheliangNianshenUuidNumber(String cheliangNianshenUuidNumber) {
        this.cheliangNianshenUuidNumber = cheliangNianshenUuidNumber;
    }
    /**
	 * 获取：年审名称
	 */
    public String getCheliangNianshenName() {
        return cheliangNianshenName;
    }


    /**
	 * 设置：年审名称
	 */
    public void setCheliangNianshenName(String cheliangNianshenName) {
        this.cheliangNianshenName = cheliangNianshenName;
    }
    /**
	 * 获取：年审文件
	 */
    public String getCheliangNianshenFile() {
        return cheliangNianshenFile;
    }


    /**
	 * 设置：年审文件
	 */
    public void setCheliangNianshenFile(String cheliangNianshenFile) {
        this.cheliangNianshenFile = cheliangNianshenFile;
    }
    /**
	 * 获取：年审时间
	 */
    public Date getCheliangNianshenTime() {
        return cheliangNianshenTime;
    }


    /**
	 * 设置：年审时间
	 */
    public void setCheliangNianshenTime(Date cheliangNianshenTime) {
        this.cheliangNianshenTime = cheliangNianshenTime;
    }
    /**
	 * 获取：年审详情
	 */
    public String getCheliangNianshenContent() {
        return cheliangNianshenContent;
    }


    /**
	 * 设置：年审详情
	 */
    public void setCheliangNianshenContent(String cheliangNianshenContent) {
        this.cheliangNianshenContent = cheliangNianshenContent;
    }
    /**
	 * 获取：年审结果
	 */
    public Integer getCheliangNianshenTypes() {
        return cheliangNianshenTypes;
    }


    /**
	 * 设置：年审结果
	 */
    public void setCheliangNianshenTypes(Integer cheliangNianshenTypes) {
        this.cheliangNianshenTypes = cheliangNianshenTypes;
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
