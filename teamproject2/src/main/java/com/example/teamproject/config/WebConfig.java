package com.example.teamproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/notice/**").addResourceLocations("file:///c:/upload/notice/");
		registry.addResourceHandler("/nori/**").addResourceLocations("file:///c:/upload/nori/");
		registry.addResourceHandler("/event/**").addResourceLocations("file:///c:/upload/event/");
		registry.addResourceHandler("/freeMember/**").addResourceLocations("file:///c:/upload/freeMember/");
		registry.addResourceHandler("/freeSeller/**").addResourceLocations("file:///c:/upload/freeSeller/");
		registry.addResourceHandler("/finfo/**").addResourceLocations("file:///c:/upload/finfo/");
		
	}

}
