package com.csd.springcloudzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient //开启注册中心客户端
@EnableZuulProxy //开启网关
public class SpringCloudZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZullApplication.class, args);
	}

}

