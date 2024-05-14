package com.entity.view;

import com.entity.CheliangWeizhangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车辆违章
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cheliang_weizhang")
public class CheliangWeizhangView extends CheliangWeizhangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 车辆违章类型的值
		*/
		private String cheliangWeizhangValue;



		//级联表 cheliang
			/**
			* 车辆 的 驾驶员
			*/
			private Integer cheliangJiashiyuanId;
			/**
			* 车辆编号
			*/
			private String cheliangUuidNumber;
			/**
			* 车辆名称
			*/
			private String cheliangName;
			/**
			* 车辆购买日期
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date goumaiTime;
			/**
			* 车辆类型
			*/
			private Integer cheliangTypes;
				/**
				* 车辆类型的值
				*/
				private String cheliangValue;
			/**
			* 车牌号
			*/
			private String cheliangChepaihao;
			/**
			* 车辆详情
			*/
			private String cheliangContent;

	public CheliangWeizhangView() {

	}

	public CheliangWeizhangView(CheliangWeizhangEntity cheliangWeizhangEntity) {
		try {
			BeanUtils.copyProperties(this, cheliangWeizhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 车辆违章类型的值
			*/
			public String getCheliangWeizhangValue() {
				return cheliangWeizhangValue;
			}
			/**
			* 设置： 车辆违章类型的值
			*/
			public void setCheliangWeizhangValue(String cheliangWeizhangValue) {
				this.cheliangWeizhangValue = cheliangWeizhangValue;
			}




				//级联表的get和set cheliang

					/**
					* 获取：车辆 的 驾驶员
					*/
					public Integer getCheliangJiashiyuanId() {
						return cheliangJiashiyuanId;
					}
					/**
					* 设置：车辆 的 驾驶员
					*/
					public void setCheliangJiashiyuanId(Integer cheliangJiashiyuanId) {
						this.cheliangJiashiyuanId = cheliangJiashiyuanId;
					}


					/**
					* 获取： 车辆编号
					*/
					public String getCheliangUuidNumber() {
						return cheliangUuidNumber;
					}
					/**
					* 设置： 车辆编号
					*/
					public void setCheliangUuidNumber(String cheliangUuidNumber) {
						this.cheliangUuidNumber = cheliangUuidNumber;
					}

					/**
					* 获取： 车辆名称
					*/
					public String getCheliangName() {
						return cheliangName;
					}
					/**
					* 设置： 车辆名称
					*/
					public void setCheliangName(String cheliangName) {
						this.cheliangName = cheliangName;
					}

					/**
					* 获取： 车辆购买日期
					*/
					public Date getGoumaiTime() {
						return goumaiTime;
					}
					/**
					* 设置： 车辆购买日期
					*/
					public void setGoumaiTime(Date goumaiTime) {
						this.goumaiTime = goumaiTime;
					}

					/**
					* 获取： 车辆类型
					*/
					public Integer getCheliangTypes() {
						return cheliangTypes;
					}
					/**
					* 设置： 车辆类型
					*/
					public void setCheliangTypes(Integer cheliangTypes) {
						this.cheliangTypes = cheliangTypes;
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

					/**
					* 获取： 车牌号
					*/
					public String getCheliangChepaihao() {
						return cheliangChepaihao;
					}
					/**
					* 设置： 车牌号
					*/
					public void setCheliangChepaihao(String cheliangChepaihao) {
						this.cheliangChepaihao = cheliangChepaihao;
					}

					/**
					* 获取： 车辆详情
					*/
					public String getCheliangContent() {
						return cheliangContent;
					}
					/**
					* 设置： 车辆详情
					*/
					public void setCheliangContent(String cheliangContent) {
						this.cheliangContent = cheliangContent;
					}
















}
