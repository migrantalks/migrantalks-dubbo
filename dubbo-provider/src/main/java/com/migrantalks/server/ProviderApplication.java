package com.migrantalks.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ImportResource;

/**
 * dubbo provider 主程序
 * @author zgs
 * @date 2019/04/19
 **/
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml", "classpath:spring/dubbo-provider.xml"})
@MapperScan(basePackages = "com.migrantalks.model.mapper")
public class ProviderApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProviderApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApplication.class, args);
    }

}