/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.logic.UserSpringLogic.java
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
package com.gus.microservice.user.logic;

import com.gus.microservice.user.domain.lifecycle.StoreLifecycle;
import com.gus.microservice.user.domain.logic.UserLogic;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserSpringLogic.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserSpringLogic extends UserLogic {

    public UserSpringLogic(StoreLifecycle storeLifecycle) {
        super(storeLifecycle);
        // TODO Auto-generated constructor stub
    }

}