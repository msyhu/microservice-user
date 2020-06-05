/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.listen.OtherSampleEventConsumer.java
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
package com.gus.microservice.user.listen;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * OtherSampleEventConsumer.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@EnableBinding( OtherSampleEventSink.class )
public class OtherSampleEventConsumer {

    
    // UserService service;

    // TODO Example
    // Need to other microservice for Event
    //
    // @StreamListener( OtherSampleEventSink.INPUT_NAME )
    // public void listenEvent( @Payload OtherSampleEvent event ) {
    // }
}
