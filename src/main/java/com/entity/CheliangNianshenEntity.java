package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 车辆年审
 *
 * @author 
 * @email
 */
@TableName("cheliang_nianshen")
public class CheliangNianshenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangNianshenEntity() {

	}

	public CheliangNianshenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "CheliangNianshen{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", cheliangNianshenUuidNumber=" + cheliangNianshenUuidNumber +
            ", cheliangNianshenName=" + cheliangNianshenName +
            ", cheliangNianshenFile=" + cheliangNianshenFile +
            ", cheliangNianshenTime=" + cheliangNianshenTime +
            ", cheliangNianshenContent=" + cheliangNianshenContent +
            ", cheliangNianshenTypes=" + cheliangNianshenTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
