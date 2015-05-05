package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取cookie中的uid(不做登录验证).
 * 
 * @author 阿海
 * 
 */

@Service
public class CookieUidPageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
		String cookie = XParamUtil.getCookie("uid", request);
		long uid;
		try {
			uid = Long.parseLong(cookie);
		}
		catch (Exception e) {
			uid = 0;
		}
		return Long.toString(uid);
	}

	@Override
	public String getKey() {
		return "cookieUid";
	}

}
