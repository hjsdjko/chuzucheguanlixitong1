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
 * 车辆违章
 *
 * @author 
 * @email
 */
@TableName("cheliang_weizhang")
public class CheliangWeizhangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangWeizhangEntity() {

	}

	public CheliangWeizhangEntity(T t) {
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
     * 违章编号
     */
    @TableField(value = "cheliang_weizhang_uuid_number")

    private String cheliangWeizhangUuidNumber;


    /**
     * 违章名称
     */
    @TableField(value = "cheliang_weizhang_name")

    private String cheliangWeizhangName;


    /**
     * 违章相关文件
     */
    @TableField(value = "cheliang_weizhang_file")

    private String cheliangWeizhangFile;


    /**
     * 违章详情
     */
    @TableField(value = "cheliang_weizhang_content")

    private String cheliangWeizhangContent;


    /**
     * 发生违章时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "cheliang_weizhang_time")

    private Date cheliangWeizhangTime;


    /**
     * 处理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "cheliang_weizhang_chuli_time")

    private Date cheliangWeizhangChuliTime;


    /**
     * 车辆违章类型
     */
    @TableField(value = "cheliang_weizhang_types")

    private Integer cheliangWeizhangTypes;


    /**
     * 处理结果
     */
    @TableField(value = "cheliang_weizhang_chulijieguo_content")

    private String cheliangWeizhangChulijieguoContent;


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
	 * 设置：违章编号
	 */
    public String getCheliangWeizhangUuidNumber() {
        return cheliangWeizhangUuidNumber;
    }
    /**
	 * 获取：违章编号
	 */

    public void setCheliangWeizhangUuidNumber(String cheliangWeizhangUuidNumber) {
        this.cheliangWeizhangUuidNumber = cheliangWeizhangUuidNumber;
    }
    /**
	 * 设置：违章名称
	 */
    public String getCheliangWeizhangName() {
        return cheliangWeizhangName;
    }
    /**
	 * 获取：违章名称
	 */

    public void setCheliangWeizhangName(String cheliangWeizhangName) {
        this.cheliangWeizhangName = cheliangWeizhangName;
    }
    /**
	 * 设置：违章相关文件
	 */
    public String getCheliangWeizhangFile() {
        return cheliangWeizhangFile;
    }
    /**
	 * 获取：违章相关文件
	 */

    public void setCheliangWeizhangFile(String cheliangWeizhangFile) {
        this.cheliangWeizhangFile = cheliangWeizhangFile;
    }
    /**
	 * 设置：违章详情
	 */
    public String getCheliangWeizhangContent() {
        return cheliangWeizhangContent;
    }
    /**
	 * 获取：违章详情
	 */

    public void setCheliangWeizhangContent(String cheliangWeizhangContent) {
        this.cheliangWeizhangContent = cheliangWeizhangContent;
    }
    /**
	 * 设置：发生违章时间
	 */
    public Date getCheliangWeizhangTime() {
        return cheliangWeizhangTime;
    }
    /**
	 * 获取：发生违章时间
	 */

    public void setCheliangWeizhangTime(Date cheliangWeizhangTime) {
        this.cheliangWeizhangTime = cheliangWeizhangTime;
    }
    /**
	 * 设置：处理时间
	 */
    public Date getCheliangWeizhangChuliTime() {
        return cheliangWeizhangChuliTime;
    }
    /**
	 * 获取：处理时间
	 */

    public void setCheliangWeizhangChuliTime(Date cheliangWeizhangChuliTime) {
        this.cheliangWeizhangChuliTime = cheliangWeizhangChuliTime;
    }
    /**
	 * 设置：车辆违章类型
	 */
    public Integer getCheliangWeizhangTypes() {
        return cheliangWeizhangTypes;
    }
    /**
	 * 获取：车辆违章类型
	 */

    public void setCheliangWeizhangTypes(Integer cheliangWeizhangTypes) {
        this.cheliangWeizhangTypes = cheliangWeizhangTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getCheliangWeizhangChulijieguoContent() {
        return cheliangWeizhangChulijieguoContent;
    }
    /**
	 * 获取：处理结果
	 */

    public void setCheliangWeizhangChulijieguoContent(String cheliangWeizhangChulijieguoContent) {
        this.cheliangWeizhangChulijieguoContent = cheliangWeizhangChulijieguoContent;
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
        return "CheliangWeizhang{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", cheliangWeizhangUuidNumber=" + cheliangWeizhangUuidNumber +
            ", cheliangWeizhangName=" + cheliangWeizhangName +
            ", cheliangWeizhangFile=" + cheliangWeizhangFile +
            ", cheliangWeizhangContent=" + cheliangWeizhangContent +
            ", cheliangWeizhangTime=" + cheliangWeizhangTime +
            ", cheliangWeizhangChuliTime=" + cheliangWeizhangChuliTime +
            ", cheliangWeizhangTypes=" + cheliangWeizhangTypes +
            ", cheliangWeizhangChulijieguoContent=" + cheliangWeizhangChulijieguoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
