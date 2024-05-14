package com.entity.model;

import com.entity.CheliangWeizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆违章
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangWeizhangModel implements Serializable {
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
     * 违章编号
     */
    private String cheliangWeizhangUuidNumber;


    /**
     * 违章名称
     */
    private String cheliangWeizhangName;


    /**
     * 违章相关文件
     */
    private String cheliangWeizhangFile;


    /**
     * 违章详情
     */
    private String cheliangWeizhangContent;


    /**
     * 发生违章时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangWeizhangTime;


    /**
     * 处理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangWeizhangChuliTime;


    /**
     * 车辆违章类型
     */
    private Integer cheliangWeizhangTypes;


    /**
     * 处理结果
     */
    private String cheliangWeizhangChulijieguoContent;


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
	 * 获取：违章编号
	 */
    public String getCheliangWeizhangUuidNumber() {
        return cheliangWeizhangUuidNumber;
    }


    /**
	 * 设置：违章编号
	 */
    public void setCheliangWeizhangUuidNumber(String cheliangWeizhangUuidNumber) {
        this.cheliangWeizhangUuidNumber = cheliangWeizhangUuidNumber;
    }
    /**
	 * 获取：违章名称
	 */
    public String getCheliangWeizhangName() {
        return cheliangWeizhangName;
    }


    /**
	 * 设置：违章名称
	 */
    public void setCheliangWeizhangName(String cheliangWeizhangName) {
        this.cheliangWeizhangName = cheliangWeizhangName;
    }
    /**
	 * 获取：违章相关文件
	 */
    public String getCheliangWeizhangFile() {
        return cheliangWeizhangFile;
    }


    /**
	 * 设置：违章相关文件
	 */
    public void setCheliangWeizhangFile(String cheliangWeizhangFile) {
        this.cheliangWeizhangFile = cheliangWeizhangFile;
    }
    /**
	 * 获取：违章详情
	 */
    public String getCheliangWeizhangContent() {
        return cheliangWeizhangContent;
    }


    /**
	 * 设置：违章详情
	 */
    public void setCheliangWeizhangContent(String cheliangWeizhangContent) {
        this.cheliangWeizhangContent = cheliangWeizhangContent;
    }
    /**
	 * 获取：发生违章时间
	 */
    public Date getCheliangWeizhangTime() {
        return cheliangWeizhangTime;
    }


    /**
	 * 设置：发生违章时间
	 */
    public void setCheliangWeizhangTime(Date cheliangWeizhangTime) {
        this.cheliangWeizhangTime = cheliangWeizhangTime;
    }
    /**
	 * 获取：处理时间
	 */
    public Date getCheliangWeizhangChuliTime() {
        return cheliangWeizhangChuliTime;
    }


    /**
	 * 设置：处理时间
	 */
    public void setCheliangWeizhangChuliTime(Date cheliangWeizhangChuliTime) {
        this.cheliangWeizhangChuliTime = cheliangWeizhangChuliTime;
    }
    /**
	 * 获取：车辆违章类型
	 */
    public Integer getCheliangWeizhangTypes() {
        return cheliangWeizhangTypes;
    }


    /**
	 * 设置：车辆违章类型
	 */
    public void setCheliangWeizhangTypes(Integer cheliangWeizhangTypes) {
        this.cheliangWeizhangTypes = cheliangWeizhangTypes;
    }
    /**
	 * 获取：处理结果
	 */
    public String getCheliangWeizhangChulijieguoContent() {
        return cheliangWeizhangChulijieguoContent;
    }


    /**
	 * 设置：处理结果
	 */
    public void setCheliangWeizhangChulijieguoContent(String cheliangWeizhangChulijieguoContent) {
        this.cheliangWeizhangChulijieguoContent = cheliangWeizhangChulijieguoContent;
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
