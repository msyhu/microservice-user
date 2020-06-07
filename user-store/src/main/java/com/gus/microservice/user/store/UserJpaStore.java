/*===================================================================================
 *                    Copyright(c) 2019 Gus
 *
 * Project            : user-service
 * Source File Name   : com.gus.microservice.user.store.UserJpaStore.java
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
package com.gus.microservice.user.store;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.gus.microservice.user.domain.entity.User;
import com.gus.microservice.user.domain.store.UserStore;
import com.gus.microservice.user.store.jpo.UserJpo;
import com.gus.microservice.user.store.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * UserJpaStore.java
 *
 * @author user
 * @version 1.0.0
 * @since 2019. 4. 4.
 */
@Repository
public class UserJpaStore implements UserStore {
    
    private final UserRepository repository;
    
    public UserJpaStore( UserRepository repository ){
        // TODO Auto-generated constructor stub
        this.repository = repository;
    }

	@Override
	public User retrieve(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get().toDomain();
	}
	
//	@PostConstruct
//	public void init() {
//		for(int i = 0; i<10; i++) {
//			repository.save(new UserJpo(User.getSample()));
//		}
//	}

	@Override
	public List<User> retrieveAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll().stream().map(UserJpo::toDomain).collect(Collectors.toList());
	}
 
}