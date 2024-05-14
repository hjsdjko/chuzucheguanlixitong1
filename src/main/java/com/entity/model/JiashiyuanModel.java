package com.entity.model;

import com.entity.JiashiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 驾驶员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiashiyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 驾驶员姓名
     */
    private String jiashiyuanName;


    /**
     * 驾驶员手机号
     */
    private String jiashiyuanPhone;


    /**
     * 驾驶员身份证号
     */
    private String jiashiyuanIdNumber;


    /**
     * 驾驶员头像
     */
    private String jiashiyuanPhoto;


    /**
     * 年龄
     */
    private Integer age;


    /**
     * 驾龄
     */
    private String jiashiyuanJialing;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 服务资格证照片
     */
    private String jiashiyuanFuwuzigezhengPhoto;


    /**
     * 电子邮箱
     */
    private String jiashiyuanEmail;


    /**
     * 现住址
     */
    private String jiashiyuanAddress;


    /**
     * 户籍地址
     */
    private String jiashiyuanHujiAddress;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：驾驶员姓名
	 */
    public String getJiashiyuanName() {
        return jiashiyuanName;
    }


    /**
	 * 设置：驾驶员姓名
	 */
    public void setJiashiyuanName(String jiashiyuanName) {
        this.jiashiyuanName = jiashiyuanName;
    }
    /**
	 * 获取：驾驶员手机号
	 */
    public String getJiashiyuanPhone() {
        return jiashiyuanPhone;
    }


    /**
	 * 设置：驾驶员手机号
	 */
    public void setJiashiyuanPhone(String jiashiyuanPhone) {
        this.jiashiyuanPhone = jiashiyuanPhone;
    }
    /**
	 * 获取：驾驶员身份证号
	 */
    public String getJiashiyuanIdNumber() {
        return jiashiyuanIdNumber;
    }


    /**
	 * 设置：驾驶员身份证号
	 */
    public void setJiashiyuanIdNumber(String jiashiyuanIdNumber) {
        this.jiashiyuanIdNumber = jiashiyuanIdNumber;
    }
    /**
	 * 获取：驾驶员头像
	 */
    public String getJiashiyuanPhoto() {
        return jiashiyuanPhoto;
    }


    /**
	 * 设置：驾驶员头像
	 */
    public void setJiashiyuanPhoto(String jiashiyuanPhoto) {
        this.jiashiyuanPhoto = jiashiyuanPhoto;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 设置：年龄
	 */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 获取：驾龄
	 */
    public String getJiashiyuanJialing() {
        return jiashiyuanJialing;
    }


    /**
	 * 设置：驾龄
	 */
    public void setJiashiyuanJialing(String jiashiyuanJialing) {
        this.jiashiyuanJialing = jiashiyuanJialing;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：服务资格证照片
	 */
    public String getJiashiyuanFuwuzigezhengPhoto() {
        return jiashiyuanFuwuzigezhengPhoto;
    }


    /**
	 * 设置：服务资格证照片
	 */
    public void setJiashiyuanFuwuzigezhengPhoto(String jiashiyuanFuwuzigezhengPhoto) {
        this.jiashiyuanFuwuzigezhengPhoto = jiashiyuanFuwuzigezhengPhoto;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getJiashiyuanEmail() {
        return jiashiyuanEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setJiashiyuanEmail(String jiashiyuanEmail) {
        this.jiashiyuanEmail = jiashiyuanEmail;
    }
    /**
	 * 获取：现住址
	 */
    public String getJiashiyuanAddress() {
        return jiashiyuanAddress;
    }


    /**
	 * 设置：现住址
	 */
    public void setJiashiyuanAddress(String jiashiyuanAddress) {
        this.jiashiyuanAddress = jiashiyuanAddress;
    }
    /**
	 * 获取：户籍地址
	 */
    public String getJiashiyuanHujiAddress() {
        return jiashiyuanHujiAddress;
    }


    /**
	 * 设置：户籍地址
	 */
    public void setJiashiyuanHujiAddress(String jiashiyuanHujiAddress) {
        this.jiashiyuanHujiAddress = jiashiyuanHujiAddress;
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
