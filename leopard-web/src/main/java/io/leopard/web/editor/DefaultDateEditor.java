package io.leopard.web.editor;

import io.leopard.commons.utility.DateTime;
import io.leopard.commons.utility.DateUtil;

import java.beans.PropertyEditorSupport;

import org.apache.commons.lang.StringUtils;

public class DefaultDateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// System.out.println("DefaultDateEditor setAsText:" + text);
		if (StringUtils.isEmpty(text)) {
			super.setValue(null);
		}
		else if (DateTime.isDateTime(text)) {
			super.setValue(DateUtil.toDate(text));
		}
		else if (DateTime.isDate(text)) {
			super.setValue(DateUtil.toDate(text + " 00:00:00"));
		}
		else {
			throw new IllegalArgumentException("未知时间格式[" + text + "].");
		}
	}

}
