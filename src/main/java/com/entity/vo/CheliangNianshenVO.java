package com.entity.vo;

import com.entity.CheliangNianshenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆年审
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang_nianshen")
public class CheliangNianshenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车辆
     */

    @TableField(value = "cheliang_id")
    private Integer cheliangId;


    /**
     * 年审编号
     */

    @TableField(value = "cheliang_nianshen_uuid_number")
    private String cheliangNianshenUuidNumber;


    /**
     * 年审名称
     */

    @TableField(value = "cheliang_nianshen_name")
    private String cheliangNianshenName;


    /**
     * 年审文件
     */

    @TableField(value = "cheliang_nianshen_file")
    private String cheliangNianshenFile;


    /**
     * 年审时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "cheliang_nianshen_time")
    private Date cheliangNianshenTime;


    /**
     * 年审详情
     */

    @TableField(value = "cheliang_nianshen_content")
    private String cheliangNianshenContent;


    /**
     * 年审结果
     */

    @TableField(value = "cheliang_nianshen_types")
    private Integer cheliangNianshenTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }


    /**
	 * 获取：车辆
	 */

    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 设置：年审编号
	 */
    public String getCheliangNianshenUuidNumber() {
        return cheliangNianshenUuidNumber;
    }


    /**
	 * 获取：年审编号
	 */

    public void setCheliangNianshenUuidNumber(String cheliangNianshenUuidNumber) {
        this.cheliangNianshenUuidNumber = cheliangNianshenUuidNumber;
    }
    /**
	 * 设置：年审名称
	 */
    public String getCheliangNianshenName() {
        return cheliangNianshenName;
    }


    /**
	 * 获取：年审名称
	 */

    public void setCheliangNianshenName(String cheliangNianshenName) {
        this.cheliangNianshenName = cheliangNianshenName;
    }
    /**
	 * 设置：年审文件
	 */
    public String getCheliangNianshenFile() {
        return cheliangNianshenFile;
    }


    /**
	 * 获取：年审文件
	 */

    public void setCheliangNianshenFile(String cheliangNianshenFile) {
        this.cheliangNianshenFile = cheliangNianshenFile;
    }
    /**
	 * 设置：年审时间
	 */
    public Date getCheliangNianshenTime() {
        return cheliangNianshenTime;
    }


    /**
	 * 获取：年审时间
	 */

    public void setCheliangNianshenTime(Date cheliangNianshenTime) {
        this.cheliangNianshenTime = cheliangNianshenTime;
    }
    /**
	 * 设置：年审详情
	 */
    public String getCheliangNianshenContent() {
        return cheliangNianshenContent;
    }


    /**
	 * 获取：年审详情
	 */

    public void setCheliangNianshenContent(String cheliangNianshenContent) {
        this.cheliangNianshenContent = cheliangNianshenContent;
    }
    /**
	 * 设置：年审结果
	 */
    public Integer getCheliangNianshenTypes() {
        return cheliangNianshenTypes;
    }


    /**
	 * 获取：年审结果
	 */

    public void setCheliangNianshenTypes(Integer cheliangNianshenTypes) {
        this.cheliangNianshenTypes = cheliangNianshenTypes;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
