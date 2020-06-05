/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.bind.UserEventSource.java
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

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * UserEventSource.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public interface UserEventSource {

    // TODO example
    //
    // String OUTPUT_NAME = "output";
    //
    // @Output( OUTPUT_NAME )
    // MessageChannel outputChannel();

}
