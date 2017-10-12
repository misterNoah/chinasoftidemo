package com.chinasofti.springcloud;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import cn.org.rapid_framework.freemarker.directive.BlockDirective;
import cn.org.rapid_framework.freemarker.directive.ExtendsDirective;
import cn.org.rapid_framework.freemarker.directive.OverrideDirective;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ConsumerApplication {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }
  
  /*
   * freemark模板页面继承
   */
  @Configuration
	public class FreemarkerConfig {
	    @Autowired
	    freemarker.template.Configuration configuration;
	    
	    @PostConstruct
	    public void setSharedVariable(){
	        configuration.setSharedVariable("block", new BlockDirective());
	        configuration.setSharedVariable("override", new OverrideDirective());
	        configuration.setSharedVariable("extends", new ExtendsDirective());
	    }
	}
}
