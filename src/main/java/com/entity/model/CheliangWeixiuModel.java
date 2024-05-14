package com.entity.model;

import com.entity.CheliangWeixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆维修
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangWeixiuModel implements Serializable {
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
     * 维修编号
     */
    private String cheliangWeixiuUuidNumber;


    /**
     * 维修名称
     */
    private String cheliangWeixiuName;


    /**
     * 维修文件
     */
    private String cheliangWeixiuFile;


    /**
     * 维修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangWeixiuTime;


    /**
     * 维修详情
     */
    private String cheliangWeixiuContent;


    /**
     * 维修结果
     */
    private Integer cheliangWeixiuTypes;


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
	 * 获取：维修编号
	 */
    public String getCheliangWeixiuUuidNumber() {
        return cheliangWeixiuUuidNumber;
    }


    /**
	 * 设置：维修编号
	 */
    public void setCheliangWeixiuUuidNumber(String cheliangWeixiuUuidNumber) {
        this.cheliangWeixiuUuidNumber = cheliangWeixiuUuidNumber;
    }
    /**
	 * 获取：维修名称
	 */
    public String getCheliangWeixiuName() {
        return cheliangWeixiuName;
    }


    /**
	 * 设置：维修名称
	 */
    public void setCheliangWeixiuName(String cheliangWeixiuName) {
        this.cheliangWeixiuName = cheliangWeixiuName;
    }
    /**
	 * 获取：维修文件
	 */
    public String getCheliangWeixiuFile() {
        return cheliangWeixiuFile;
    }


    /**
	 * 设置：维修文件
	 */
    public void setCheliangWeixiuFile(String cheliangWeixiuFile) {
        this.cheliangWeixiuFile = cheliangWeixiuFile;
    }
    /**
	 * 获取：维修时间
	 */
    public Date getCheliangWeixiuTime() {
        return cheliangWeixiuTime;
    }


    /**
	 * 设置：维修时间
	 */
    public void setCheliangWeixiuTime(Date cheliangWeixiuTime) {
        this.cheliangWeixiuTime = cheliangWeixiuTime;
    }
    /**
	 * 获取：维修详情
	 */
    public String getCheliangWeixiuContent() {
        return cheliangWeixiuContent;
    }


    /**
	 * 设置：维修详情
	 */
    public void setCheliangWeixiuContent(String cheliangWeixiuContent) {
        this.cheliangWeixiuContent = cheliangWeixiuContent;
    }
    /**
	 * 获取：维修结果
	 */
    public Integer getCheliangWeixiuTypes() {
        return cheliangWeixiuTypes;
    }


    /**
	 * 设置：维修结果
	 */
    public void setCheliangWeixiuTypes(Integer cheliangWeixiuTypes) {
        this.cheliangWeixiuTypes = cheliangWeixiuTypes;
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
