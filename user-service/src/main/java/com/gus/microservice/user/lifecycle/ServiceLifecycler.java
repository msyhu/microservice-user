
/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.lifecycle.ServiceLifecycler.java
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
package com.gus.microservice.user.lifecycle;

import com.gus.microservice.user.domain.lifecycle.ServiceLifecycle;
import com.gus.microservice.user.domain.spec.UserService;
import org.springframework.stereotype.Component;

/**
 * ServiceLifecycler.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Component
public class ServiceLifecycler implements ServiceLifecycle {
    
	private final UserService userService;
	
	public ServiceLifecycler(UserService userService){
		this.userService = userService;
	}
	
	public UserService requestUserService(){
		return this.userService;
	}
}
