package com.learning.rest.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.rest.bean.User;

@Service
public class UserService {

  private static List<User> users = new ArrayList<User>() {
		{
			add(new User(1, "Apple", "Developer"));
			add(new User(2, "Google", "Developer"));
			add(new User(3, "Microsoft", "Developer"));
			add(new User(4, "TCS", "Developer"));
		}
	};

	public User addUser(User userObj) {
		int userCount = users.size();
		userObj.setId(++userCount);
		users.add(userObj);
		return userObj;
	}

	public User deleteUser(int userId) {
		Iterator<User> itr = users.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getId() == userId)
				itr.remove();
			return user;
		}
		return null;
	}

	public void updateUser() {

	}

	public User retrieveUser(int userId) {
		for (User user : users) {
			if (user.getId() == userId)
				return user;
		}
		return null;
	}

  public List<User> retrieveAllUsers() {
    return users;
  }

}
