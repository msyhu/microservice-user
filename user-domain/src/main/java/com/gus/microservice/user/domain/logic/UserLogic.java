/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.logic.UserLogic.java
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
package com.gus.microservice.user.domain.logic;


import com.gus.microservice.user.domain.entity.User;
import com.gus.microservice.user.domain.lifecycle.StoreLifecycle;
import com.gus.microservice.user.domain.spec.UserService;
import com.gus.microservice.user.domain.store.UserStore;

import java.util.List;

/**
 * UserLogic.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public class UserLogic implements UserService {

    
    private UserStore userStore;
    
    public UserLogic (StoreLifecycle storeLifecycle){
    	userStore = storeLifecycle.requestUserStore();
    }

	@Override
	public User findData(String id) {
		// TODO Auto-generated method stub
		return userStore.retrieve(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userStore.retrieveAll();
	}


//    UserEventProducer eventProducer;

    
}
