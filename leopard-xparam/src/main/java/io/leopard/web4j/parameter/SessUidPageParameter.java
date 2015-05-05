package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取session中的uid.
 * 
 * @author 阿海
 * 
 */
@Service
public class SessUidPageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
//		Long sessUid = SessionUtil.getUid(request.getSession());
//		if (sessUid == null) {
//			String ip = RequestUtil.getProxyIp(request);
//			throw new NotLoginException("您[" + ip + "]未登录.");
//		}
//		return Long.toString(sessUid);
		throw new UnsupportedOperationException("Not Impl.");
	}

	@Override
	public String getKey() {
		return "sessUid";
	}
}
