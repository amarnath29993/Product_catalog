package com.marlabs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket configSwagger() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.marlabs.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	/*
	 * private ApiInfo getApiInfo() { return new ApiInfo("REST API DOCUMENTTAION",
	 * "REST API DOCUMENTTAION", "1.0", "urn:tos", new Contact("", "", ""),
	 * "Apache 2.0\", \"http://www.apache.org/licenses/LICENSE-2.0",
	 * "new ArrayList<VendorExtension>()");
	 * 
	 * }
	 */

	/*
	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
	 * WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addCorsMapping(CorsRegistry registry) {
	 * registry.addMapping("/*") .allowedMethods("PUT","DELETE","GET","POST")
	 * .allowedHeaders("Content-Type", "Access-Control-Allow-Origin",
	 * "Access-Control-Allow-Headers", "Authorizationn", "requestId"); } };
	 * 
	 * }
	 */
}
