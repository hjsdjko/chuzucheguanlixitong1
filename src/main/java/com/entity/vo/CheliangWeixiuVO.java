package com.entity.vo;

import com.entity.CheliangWeixiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆维修
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang_weixiu")
public class CheliangWeixiuVO implements Serializable {
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
     * 维修编号
     */

    @TableField(value = "cheliang_weixiu_uuid_number")
    private String cheliangWeixiuUuidNumber;


    /**
     * 维修名称
     */

    @TableField(value = "cheliang_weixiu_name")
    private String cheliangWeixiuName;


    /**
     * 维修文件
     */

    @TableField(value = "cheliang_weixiu_file")
    private String cheliangWeixiuFile;


    /**
     * 维修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "cheliang_weixiu_time")
    private Date cheliangWeixiuTime;


    /**
     * 维修详情
     */

    @TableField(value = "cheliang_weixiu_content")
    private String cheliangWeixiuContent;


    /**
     * 维修结果
     */

    @TableField(value = "cheliang_weixiu_types")
    private Integer cheliangWeixiuTypes;


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
	 * 设置：维修编号
	 */
    public String getCheliangWeixiuUuidNumber() {
        return cheliangWeixiuUuidNumber;
    }


    /**
	 * 获取：维修编号
	 */

    public void setCheliangWeixiuUuidNumber(String cheliangWeixiuUuidNumber) {
        this.cheliangWeixiuUuidNumber = cheliangWeixiuUuidNumber;
    }
    /**
	 * 设置：维修名称
	 */
    public String getCheliangWeixiuName() {
        return cheliangWeixiuName;
    }


    /**
	 * 获取：维修名称
	 */

    public void setCheliangWeixiuName(String cheliangWeixiuName) {
        this.cheliangWeixiuName = cheliangWeixiuName;
    }
    /**
	 * 设置：维修文件
	 */
    public String getCheliangWeixiuFile() {
        return cheliangWeixiuFile;
    }


    /**
	 * 获取：维修文件
	 */

    public void setCheliangWeixiuFile(String cheliangWeixiuFile) {
        this.cheliangWeixiuFile = cheliangWeixiuFile;
    }
    /**
	 * 设置：维修时间
	 */
    public Date getCheliangWeixiuTime() {
        return cheliangWeixiuTime;
    }


    /**
	 * 获取：维修时间
	 */

    public void setCheliangWeixiuTime(Date cheliangWeixiuTime) {
        this.cheliangWeixiuTime = cheliangWeixiuTime;
    }
    /**
	 * 设置：维修详情
	 */
    public String getCheliangWeixiuContent() {
        return cheliangWeixiuContent;
    }


    /**
	 * 获取：维修详情
	 */

    public void setCheliangWeixiuContent(String cheliangWeixiuContent) {
        this.cheliangWeixiuContent = cheliangWeixiuContent;
    }
    /**
	 * 设置：维修结果
	 */
    public Integer getCheliangWeixiuTypes() {
        return cheliangWeixiuTypes;
    }


    /**
	 * 获取：维修结果
	 */

    public void setCheliangWeixiuTypes(Integer cheliangWeixiuTypes) {
        this.cheliangWeixiuTypes = cheliangWeixiuTypes;
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
