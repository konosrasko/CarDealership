package com.Antiprosopia;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200/**", "http://192.168.1.7:4200","**")
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
//                .allowCredentials(true)
//                .maxAge(3600);
//    }

    private static final int CORS_MAX_AGE = 3600;
    private static final String[] CORS_ALLOWED_ORIGINS = {"*"};
    private static final String[] CORS_ALLOWED_METHODS = {
            "POST", "GET", "OPTIONS", "PUT", "DELETE"
    };
    private static final String[] CORS_ALLOWED_HEADERS = {
            "X-Requested-With", "content-type", "Authorization"
    };

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(CORS_ALLOWED_ORIGINS)
                .allowedMethods(CORS_ALLOWED_METHODS)
                .maxAge(CORS_MAX_AGE)
                .allowedHeaders(CORS_ALLOWED_HEADERS)
        ;
    }

}