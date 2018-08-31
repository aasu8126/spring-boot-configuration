package com.config.Configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @Component
// @PropertySource({ "classpath:per-${envTarget:spring.profiles.active}.properties" })
public class ConfClassFile {

	
	@Value("${application.url}")
	public String url;
	
//	@Autowired
//	Environment env;
//	
//	// @Value("${application.url}")
//	public String url = Preconditions.checkNotNull(env.getProperty("jdbc.driverClassName"));
//
//	public String getUrl() {
//		return url;
//	}
}
