package com.entity.view;

import com.entity.JifanghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 机房号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 22:38:49
 */
@TableName("jifanghao")
public class JifanghaoView  extends JifanghaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JifanghaoView(){
	}
 
 	public JifanghaoView(JifanghaoEntity jifanghaoEntity){
 	try {
			BeanUtils.copyProperties(this, jifanghaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
