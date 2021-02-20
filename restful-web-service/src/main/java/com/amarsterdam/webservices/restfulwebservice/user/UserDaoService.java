package com.amarsterdam.webservices.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User>users= new ArrayList<User>();
	private static int userCount=5;
	static{
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Badam",new Date()));
		users.add(new User(3,"Saddam",new Date()));
		users.add(new User(4,"Nijam",new Date()));
		users.add(new User(5,"kadam",new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	public User save(User user){
		if(user.getId()== null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id){
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
