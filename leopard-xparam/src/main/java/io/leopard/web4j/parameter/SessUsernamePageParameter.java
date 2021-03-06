package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取存在session中的用户名.
 * 
 * @author 阿海
 * 
 */
@Service
public class SessUsernamePageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
//		String sessUsername = SessionUtil.getUsername(request.getSession());
//		if (sessUsername == null) {
//			String ip = RequestUtil.getProxyIp(request);
//			throw new NotLoginException("您[" + ip + "]未登录.");
//
//		}
//		return sessUsername;
		throw new UnsupportedOperationException("Not Impl.");
	}

	@Override
	public String getKey() {
		return "sessUsername";
	}
}
