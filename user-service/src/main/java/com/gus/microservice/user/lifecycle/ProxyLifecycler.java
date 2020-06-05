/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.lifecycle.ProxyLifecycler.java
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

import com.gus.microservice.user.domain.lifecycle.ProxyLifecycle;
import com.gus.microservice.user.domain.proxy.UserEventProducer;
import com.gus.microservice.user.domain.proxy.YardProxy;
import org.springframework.stereotype.Component;

/**
 * ProxyLifecycler.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Component
public class ProxyLifecycler implements ProxyLifecycle {
    
	private final YardProxy yardProxy;
	private final UserEventProducer userEventProducer;
	
	public ProxyLifecycler( YardProxy yardProxy, UserEventProducer userEventProducer ){
		this.yardProxy = yardProxy;
		this.userEventProducer = userEventProducer;
	}
	
	@Override
	public YardProxy requestYardProxy(){
	    // TODO Auto-generated method stub
		return this.yardProxy;
	}
	
	@Override
    public UserEventProducer requestUserEventProducer(){
        // TODO Auto-generated method stub
        return this.userEventProducer;
    }
}
