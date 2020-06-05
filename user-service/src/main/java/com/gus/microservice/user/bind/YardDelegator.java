/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.bind.YardDelegator.java
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
package com.gus.microservice.user.bind;

import com.gus.microservice.user.domain.proxy.YardProxy;
import org.springframework.stereotype.Service;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * YardDelegator.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Service
@EnableCircuitBreaker
@EnableFeignClients//( basePackage ={""})
public class YardDelegator implements YardProxy {


}
