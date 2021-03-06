package io.leopard.schema.config;

import io.leopard.data4j.schema.BeanDefinitionParserUtil;
import io.leopard.test4j.mock.LeopardMockRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.xml.ParserContext;

@RunWith(LeopardMockRunner.class)
@PrepareForTest({ BeanDefinitionParserUtil.class, ParserContext.class })
public class PerformanceConfigBeanDefinitionParserTest {

	@Test
	public void parse() {
		PerformanceConfigBeanDefinitionParser parser = new PerformanceConfigBeanDefinitionParser();
		ParserContext parserContext = Mockito.mock(ParserContext.class);

		parser.parse("", parserContext);
		parser.parse("", parserContext);
	}

}