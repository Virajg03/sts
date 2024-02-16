package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user = new User();
		 * 
		 * user.setName("viraj gajera"); user.setCity("Ahmedabad");
		 * user.setStatus("I am good man");
		 * 
		 * User user2 = userRepository.save(user);
		 * 
		 * System.out.println(user2);
		 */

		// create object for user

		User user = new User();

		user.setId(132);
		user.setName("gajera");
		user.setCity("jdhycgcj");
		user.setStatus("he is veryyyy");
//
//		System.out.println(user);
//		
//		User user2 = new User();
//		
//		user2.setName("adi");
//		user2.setCity("mahesana");
//		user2.setStatus("he is not  veryyyy");
//
		List<User> list = List.of(user);
//		
		userRepository.saveAll(list);

//		System.out.println(user2);
//_______________________________________________________________________________________
	// update the user by  id
		
//		Optional<User> optional = userRepository.findById(1);
//		
//		User user3 = optional.get();
//		
//		user3.setName("samarth");
//		
//		User result = userRepository.save(user3);
//		
//		System.out.println(result);
//		
		
		//______________________________________________________
		
		//get data
		
		
//		Optional<User> optional = userRepository.findById(1);
		
//		Iterable<User> all = userRepository.findAll();
//		
//		Iterator<User> iterator = all.iterator();
//		 
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		all.forEach(user->{System.out.println(user);});
		
		
		//deleting the user
		
//		0
		
///____________________________________________________________________________		
		
//		find by  methods
		
		
//		List<User> find = userRepository.findByNameAndCity("ram", "ayodhya");
//		find.forEach(e->{System.out.println(e);});
		
		
//		List<User> find = userRepository.findAll();
//		find.forEach(e->{System.out.println(e);});
//		
		
		
		List<User> find = userRepository.findByName("ram");
		find.forEach(e->{System.out.println(e);});
		
		
		
		
		
		
	}

}
