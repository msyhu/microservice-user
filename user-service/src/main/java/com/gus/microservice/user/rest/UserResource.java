/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.rest.UserResource.java
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
package com.gus.microservice.user.rest;

import java.util.List;

import com.gus.microservice.user.domain.entity.User;
import com.gus.microservice.user.domain.lifecycle.ServiceLifecycle;
import com.gus.microservice.user.domain.spec.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserResource.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@RestController
@RequestMapping
public class UserResource {

	public final UserService userService;
	
    public UserResource(ServiceLifecycle serviceLifecycle){
    	this.userService = serviceLifecycle.requestUserService();
    }
    
    @GetMapping(value="/{userId}")
    public User find(@PathVariable(value="userId") String userId) {
    	return userService.findData(userId);
    }
    
    @GetMapping(value= {"","/"})
    public List<User> findAll(){
    	return this.userService.findAll();
    }

}
