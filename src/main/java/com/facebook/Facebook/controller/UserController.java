package com.facebook.Facebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.Facebook.model.UserInfo;

@RestController
public class UserController {

	@GetMapping("/userinfo")
	public UserInfo getUserInfo() {
		return new UserInfo("naresh", "naresh");
		
	}
	
}
