/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-store-jpa
 * Source File Name   : com.gus.microservice.user.lifecycle.StoreLifecycler.java
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

import org.springframework.stereotype.Component;

import com.gus.microservice.user.domain.lifecycle.StoreLifecycle;
import com.gus.microservice.user.domain.store.UserStore;

/**
 * UserJpo.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Component
public class StoreLifecycler implements StoreLifecycle {
	private final UserStore userStore;
	
	public StoreLifecycler( UserStore userStore ){
		this.userStore = userStore;
	}
	
	@Override
	public UserStore requestUserStore(){
		return this.userStore;
	}
	
}
