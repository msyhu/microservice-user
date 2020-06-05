/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-client
 * Source File Name   : com.gus.microservice.user.client.UserClient.java
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
package com.gus.microservice.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gus.microservice.user.domain.entity.User;

@FeignClient( name = "user")
public interface UserClient {

	@GetMapping(value="/user/{userId}")
	public User findUser(@PathVariable(value="userId") String id);
}
