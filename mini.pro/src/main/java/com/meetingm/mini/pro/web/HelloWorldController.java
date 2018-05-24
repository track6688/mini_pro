package com.meetingm.mini.pro.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meetingm.mini.pro.dao.SysuserMapper;
import com.meetingm.mini.pro.entity.Sysuser;


/**
 * 
 * 
 * <pre>
 * 
 * </pre>
 * 
 * @author guojz jiazhen.guo@meicloud.com
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@RestController
public class HelloWorldController {

	@Resource
	SysuserMapper mapper;
	
	@Value("#{wxProperties.AppID}")
	String appid;
	/**
	 * 
	 */
	@RequestMapping(value="/hello")
	public Sysuser hello() {
		System.out.println(appid);
		return mapper.selectByPrimaryKey(1);
	}
}
