package io.leopard.data4j.env;

import org.springframework.core.io.Resource;

/**
 * 日志配置.
 * 
 * @author 阿海
 *
 */
public interface LogConfigLei {

	void configure();

	Resource getResource(String env);
}
