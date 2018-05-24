package com.meetingm.mini.pro.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * <pre>
 * 用户相关Controller
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
@RequestMapping(value="/user")
public class UserController {
	
	
	@RequestMapping(value="login")
	public Map<String, Object> login()
	{
		Map<String, Object> map = new HashMap<>();
		
		
		
		return map;
	}

}
