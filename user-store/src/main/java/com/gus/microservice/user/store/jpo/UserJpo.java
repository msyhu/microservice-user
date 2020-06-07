/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.store.jpo.UserJpo.java
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
package com.gus.microservice.user.store.jpo;

import com.gus.microservice.user.domain.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * UserJpo.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserJpo {
    
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    @Column(name = "NAME")
	private String name;

    public UserJpo( User entity ) {

        BeanUtils.copyProperties( entity, this );
    }

    public User toDomain() {
        User entity = new User( );
        BeanUtils.copyProperties( this, entity );        
        return entity;
    }

    public static List<User> toDomains( Iterable<UserJpo> jpos ) {
        /* @formatter:off */
        return StreamSupport.stream( jpos.spliterator(), false )
                            .map( UserJpo::toDomain )
                            .collect( Collectors.toList() );
        /* @formatter:on */
    }

}
