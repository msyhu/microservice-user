/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-domain
 * Source File Name   : com.gus.microservice.user.domain.entity.User.java
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
package com.gus.microservice.user.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * User.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Getter
@Setter
public class User{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    
    public User() {
        super();
    }

    public void setValues( Map<String,String> object) {

        Set<String> keys = object.keySet();

        for(String key : keys) {
            if(key.equals("name")) {
                this.name = object.get(key);
                break;
            }
        }
    }

    public static User getSample() {
        User thisEntity = new User();
        thisEntity.setId(UUID.randomUUID().toString());
        thisEntity.setName("KIM");
        return thisEntity;
     }

    public static void main(String[] args) {
    	     System.out.println(getSample().toString());
    }

}
