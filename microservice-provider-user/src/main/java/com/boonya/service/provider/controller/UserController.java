package com.boonya.service.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.boonya.service.provider.entity.User;

@RequestMapping(value = "/users")
@RestController
public class UserController {

	/**
	 * get user by id
	 * 
	 * @return
	 */
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(@RequestParam("id") Long id) {
		if (id == null) {
			return new User();
		} else {
			User user = new User();
			user.setId(id);
			user.setName("boonya");
			user.setEmail("boonya@163.com");
			user.setGender(1);
			return user;
		}
	}

}
