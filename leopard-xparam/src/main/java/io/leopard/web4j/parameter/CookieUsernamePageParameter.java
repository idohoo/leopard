package io.leopard.web4j.parameter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CookieUsernamePageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
		String username = XParamUtil.getCookie("username", request);
		
		if (username == null) {
			return null;
		}
		try {
			return URLDecoder.decode(username, "UTF-8");
		}
		catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}

	@Override
	public String getKey() {
		return "cookieUsername";
	}

}
