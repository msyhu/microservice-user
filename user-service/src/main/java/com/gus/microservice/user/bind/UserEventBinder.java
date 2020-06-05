/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.bind.UserEventBinder.java
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

import com.gus.microservice.user.domain.proxy.UserEventProducer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * UserEventBinder.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */

@EnableBinding( UserEventSource.class )
@Component
public class UserEventBinder implements UserEventProducer {

    private UserEventSource eventSource;
    
    public UserEventBinder( UserEventSource eventSource ){
        this.eventSource = eventSource;
    }

}
