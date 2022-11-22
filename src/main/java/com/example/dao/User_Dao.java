package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.stereotype.Repository;

import com.example.entity.User_Entity;

@Repository
public class User_Dao {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
    public User_Entity userSignUp(User_Entity userSignupRequest) {
    	
    	
         
    	entityManager.createNativeQuery("INSERT INTO User_Entity (id,email,password,first_name,last_name,age,role_id) VALUES(?,?,?,?,?,?,?)")
    	.setParameter(1, userSignupRequest.getId())
    	.setParameter(2,userSignupRequest.getEmail())
    	.setParameter(3, userSignupRequest.getPassword())
    	.setParameter(4, userSignupRequest.getFirstName())
    	.setParameter(5, userSignupRequest.getLastName())
    	.setParameter(6, userSignupRequest.getAge())
    	.setParameter(7, userSignupRequest.getRoleOfUser())
    	.executeUpdate();
    	
    	return userSignIn(userSignupRequest);
     }
    public User_Entity userSignIn(User_Entity userSignInRequest) {
    	
         
    	
    	
    	CriteriaBuilder cb=entityManager.getCriteriaBuilder();
    	CriteriaQuery<User_Entity> cq=cb.createQuery(User_Entity.class);
    	
    	  
    	 Root<User_Entity> userRoot=cq.from(User_Entity.class);
    	 List<Predicate> predicates = new ArrayList<>();
    	    
    	    if (userSignInRequest.getEmail() != null) {
    	        predicates.add(cb.equal(userRoot.get("email"), userSignInRequest.getEmail()));
    	    }
    	  
    	 cq.where(predicates.get(0));
    	
    	return entityManager.createQuery(cq).getSingleResult();
    }
    
}
