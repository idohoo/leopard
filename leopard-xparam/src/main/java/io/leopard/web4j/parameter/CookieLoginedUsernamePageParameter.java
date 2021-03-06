package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取cookie中的username(经过通行证登录验证)
 * 
 * @author 阿海
 * 
 */
@Service
public class CookieLoginedUsernamePageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
		throw new UnsupportedOperationException("Not Impl.");
	}

	@Override
	public String getKey() {
		return "cookieLoginedUsername";
	}

}
