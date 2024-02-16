package com.jpa.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByNameAndCity(String  name,String city);
	
	@Query("select u from User u")
	public List<User> findAll();
	
	@Query("select u from User u WHERE u.name =:n")
	public List<User> findByName(@Param("n") String name);
}
