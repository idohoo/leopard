package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

/**
 * 获取当前页码.
 * 
 * @author 阿海
 * 
 */
@Service
public class PageIdPageParameter implements PageParameter {

	@Override
	public String getValue(HttpServletRequest request) {
		String page = this.getPage(request);
		int pageid = XParamUtil.toInt(page);
		if (pageid < 1) {
			pageid = 1;
		}
		return Integer.toString(pageid);
	}

	protected String getPage(HttpServletRequest request) {
		String page = request.getParameter("pageid");
		if (page == null) {
			page = request.getParameter("pageId");
		}
		if (page == null) {
			page = request.getParameter("page");
		}
		if (page == null) {
			page = request.getParameter("p");
		}
		return page;
	}

	@Override
	public String getKey() {
		return "pageId";
	}

}
