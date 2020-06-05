/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.spec.UserService.java
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
package com.gus.microservice.user.domain.spec;

import java.util.List;

import com.gus.microservice.user.domain.entity.User;

/**
 * UserService.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public interface UserService {

    // TODO Example
    // String registerData( User entity );
     User findData( String id );
     List<User> findAll();
    // void modifyData( String id, NameValueList nameValues );
    // void removeData( String id );

}
