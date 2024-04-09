package com.org.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dashboard.model.UserInfo;
import com.org.dashboard.repository.UserRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserDashboardController {

	@Autowired
	private UserRepo userRepository;

	@PostMapping("/user")
	UserInfo newUser(@RequestBody UserInfo newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/users")
	List<UserInfo> getAllUsers() {
		return userRepository.findAll();

	}

	@GetMapping("/usersByTopic/{topic}")
	public List<UserInfo> findByFilterData(@PathVariable("topic") String topic

	) {

		return userRepository.findByFilterData(topic);
	}
}
