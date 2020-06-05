/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.store.UserStore.java
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
package com.gus.microservice.user.domain.store;

import java.util.List;

import com.gus.microservice.user.domain.entity.User;

/**
 * UserStore.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public interface UserStore {

    // TODO Example
    //
    // void create( User entity );
     User retrieve(String id );
    // User retrieveByCondition( String condition );
     List<User> retrieveAll();
    // void update( User entity );
    // void delete( User entity );

}
