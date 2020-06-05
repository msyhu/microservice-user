/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-boot
 * Source File Name   : com.gus.microservice.user.config.SwaggerConfiguration.java
 * Description        :
 * Author             : user
 * Version            : 1.0.0
 * File Name related  :
 * Class Name related :
 * Created Date       : 2019. 4. 4.
 * Updated Date       : 2019. 4. 4.
 * Last modifier      : user
 * Updated content    : 최초작성
 *
 *==================================================================================*/
package com.gus.microservice.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerConfiguration.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public class SwaggerConfiguration {
    @Value( "${swagger.title:user-service-api}" )
    private String title;
    @Value( "${swagger.description:user-service-api입니다}" )
    private String description;
    @Value( "${swagger.basePackage:com.gus.microservice.user}" )
    private String basePackage;
    @Value( "${swagger.termsOfServiceUrl:}" )
    private String termsOfServiceUrl;

    @Bean
    public Docket api() {
        /* @formatter:off */
        return new Docket( DocumentationType.SWAGGER_2 )
                       .select()
                       .apis( RequestHandlerSelectors.basePackage( basePackage ) )
                       .paths( PathSelectors.any() )
                       .build()
                       .apiInfo( apiInfo() );
        /* @formatter:on */
    }

    private ApiInfo apiInfo() {
        /* @formatter:off */
        return new ApiInfoBuilder()
                       .title( title )
                       .description( description )
                       .termsOfServiceUrl( termsOfServiceUrl )
                       .build();
        /* @formatter:on */
    }

}