/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.event.UserEvent.java
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
package com.gus.microservice.user.domain.event;

import com.gus.microservice.user.domain.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * UserEvent.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Getter
@Setter
@NoArgsConstructor
public class UserEvent {
    private static final long serialVersionUID = 1L;

    private User entity;

    private UserEvent( String eventType, User entity ) {
//        super( UUID.randomUUID().toString(), entity.getClass().getSimpleName(), eventType );
        this.entity = entity;
    }

    public static UserEvent buildCreateEvent( User entity ) {
        return buildEvent( "Created", entity );
    }

    private static UserEvent buildEvent( String eventType, User entity ) {
        return new UserEvent( eventType, entity );
    }
}
