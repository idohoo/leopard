package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取当前登录的自定义用户Id
 * 
 * @author 阿海
 * 
 */
@Service
public class SessUserIdPageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
//		throw new NotImplementedException();
		throw new UnsupportedOperationException("Not Impl.");
	}

	@Override
	public String getKey() {
		return "sessUserId";
	}

}
