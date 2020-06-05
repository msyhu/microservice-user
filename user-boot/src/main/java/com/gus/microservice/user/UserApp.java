/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-boot
 * Source File Name   : com.gus.microservice.user.UserApp.java
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
package com.gus.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApp {

    public static void main( String[] args ) {
        SpringApplication.run( UserApp.class, args );
    }

}
