package com.config.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.config.Configuration")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    public WebConfig() {
        super();
    }

    @Bean
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    // API
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        //super.
        registry.addViewController("/index.html");
        /*registry.addViewController("/graph.html");
        registry.addViewController("/csrfHome.html");
        registry.addViewController("/homepage.html");*/
    }

//    @Override
//    public void addInterceptors(final InterceptorRegistry registry) {
//        registry.addInterceptor(new LoggerInterceptor());
////        registry.addInterceptor(new UserInterceptor());
////        registry.addInterceptor(new SessionTimerInterceptor());
//    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    	registry.addResourceHandler("/images/**").addResourceLocations("/images/");
    	registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    	registry.addResourceHandler("/**").addResourceLocations("/");
    	
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
    	registry.addMapping("/**").allowedMethods("*");
    }
    
}