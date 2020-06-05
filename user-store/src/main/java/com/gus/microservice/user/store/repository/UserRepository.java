/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.store.repository.UserRepository.java
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
package com.gus.microservice.user.store.repository;

import com.gus.microservice.user.store.jpo.UserJpo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
public interface UserRepository extends JpaRepository<UserJpo, String> {

    // TODO Example
    // Optional<UserJpo> findByCondition( String condition );
  
}
