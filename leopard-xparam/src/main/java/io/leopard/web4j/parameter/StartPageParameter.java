package io.leopard.web4j.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 获取当前页码.
 * 
 * @author 阿海
 * 
 */
@Service
public class StartPageParameter implements PageParameter {

	@Autowired
	private PageIdPageParameter pageIdPageParameter;
	@Autowired
	private SizePageParameter sizePageParameter;

	@Override
	public String getValue(HttpServletRequest request) {
		String value = request.getParameter("start");

		int start;
		if (StringUtils.isEmpty(value)) {
			int pageId = Integer.parseInt(pageIdPageParameter.getValue(request));
			int size = Integer.parseInt(sizePageParameter.getValue(request));
			start = getPageStart(pageId, size);
		}
		else {
			start = XParamUtil.toInt(request.getParameter("start"));
			if (start <= 0) {
				start = 0;
			}
		}
		return Integer.toString(start);
	}

	/**
	 * 计算默认起始记录
	 * 
	 * @param pageid
	 *            分页编号
	 * @param size
	 *            分页大小
	 * @return 当前分页的起始记录编号
	 */
	public static int getPageStart(int pageId, int size) {
		if (pageId < 1) {
			throw new IllegalArgumentException("pageid不能小于1.");
		}
		if (size < 1) {
			throw new IllegalArgumentException("size不能小于1.");
		}
		return (pageId - 1) * size;
	}

	@Override
	public String getKey() {
		return "start";
	}

}
