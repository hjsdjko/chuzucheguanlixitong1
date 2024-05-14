package com.entity.view;

import com.entity.CheliangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车辆
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cheliang")
public class CheliangView extends CheliangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 车辆类型的值
		*/
		private String cheliangValue;



		//级联表 jiashiyuan
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

	public CheliangView() {

	}

	public CheliangView(CheliangEntity cheliangEntity) {
		try {
			BeanUtils.copyProperties(this, cheliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 车辆类型的值
			*/
			public String getCheliangValue() {
				return cheliangValue;
			}
			/**
			* 设置： 车辆类型的值
			*/
			public void setCheliangValue(String cheliangValue) {
				this.cheliangValue = cheliangValue;
			}


















				//级联表的get和set jiashiyuan

					/**
					* 获取： 驾驶员姓名
					*/
					public String getJiashiyuanName() {
						return jiashiyuanName;
					}
					/**
					* 设置： 驾驶员姓名
					*/
					public void setJiashiyuanName(String jiashiyuanName) {
						this.jiashiyuanName = jiashiyuanName;
					}

					/**
					* 获取： 驾驶员手机号
					*/
					public String getJiashiyuanPhone() {
						return jiashiyuanPhone;
					}
					/**
					* 设置： 驾驶员手机号
					*/
					public void setJiashiyuanPhone(String jiashiyuanPhone) {
						this.jiashiyuanPhone = jiashiyuanPhone;
					}

					/**
					* 获取： 驾驶员身份证号
					*/
					public String getJiashiyuanIdNumber() {
						return jiashiyuanIdNumber;
					}
					/**
					* 设置： 驾驶员身份证号
					*/
					public void setJiashiyuanIdNumber(String jiashiyuanIdNumber) {
						this.jiashiyuanIdNumber = jiashiyuanIdNumber;
					}

					/**
					* 获取： 驾驶员头像
					*/
					public String getJiashiyuanPhoto() {
						return jiashiyuanPhoto;
					}
					/**
					* 设置： 驾驶员头像
					*/
					public void setJiashiyuanPhoto(String jiashiyuanPhoto) {
						this.jiashiyuanPhoto = jiashiyuanPhoto;
					}

					/**
					* 获取： 年龄
					*/
					public Integer getAge() {
						return age;
					}
					/**
					* 设置： 年龄
					*/
					public void setAge(Integer age) {
						this.age = age;
					}

					/**
					* 获取： 驾龄
					*/
					public String getJiashiyuanJialing() {
						return jiashiyuanJialing;
					}
					/**
					* 设置： 驾龄
					*/
					public void setJiashiyuanJialing(String jiashiyuanJialing) {
						this.jiashiyuanJialing = jiashiyuanJialing;
					}

					/**
					* 获取： 服务资格证照片
					*/
					public String getJiashiyuanFuwuzigezhengPhoto() {
						return jiashiyuanFuwuzigezhengPhoto;
					}
					/**
					* 设置： 服务资格证照片
					*/
					public void setJiashiyuanFuwuzigezhengPhoto(String jiashiyuanFuwuzigezhengPhoto) {
						this.jiashiyuanFuwuzigezhengPhoto = jiashiyuanFuwuzigezhengPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getJiashiyuanEmail() {
						return jiashiyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiashiyuanEmail(String jiashiyuanEmail) {
						this.jiashiyuanEmail = jiashiyuanEmail;
					}

					/**
					* 获取： 现住址
					*/
					public String getJiashiyuanAddress() {
						return jiashiyuanAddress;
					}
					/**
					* 设置： 现住址
					*/
					public void setJiashiyuanAddress(String jiashiyuanAddress) {
						this.jiashiyuanAddress = jiashiyuanAddress;
					}

					/**
					* 获取： 户籍地址
					*/
					public String getJiashiyuanHujiAddress() {
						return jiashiyuanHujiAddress;
					}
					/**
					* 设置： 户籍地址
					*/
					public void setJiashiyuanHujiAddress(String jiashiyuanHujiAddress) {
						this.jiashiyuanHujiAddress = jiashiyuanHujiAddress;
					}


}
