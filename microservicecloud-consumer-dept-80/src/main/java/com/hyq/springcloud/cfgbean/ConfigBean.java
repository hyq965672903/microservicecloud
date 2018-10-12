package com.hyq.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	@Bean
//	@LoadBalanced // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
// @Bean
// public UserServcie getUserServcie()
// {
// return new UserServcieImpl();
// }
// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
