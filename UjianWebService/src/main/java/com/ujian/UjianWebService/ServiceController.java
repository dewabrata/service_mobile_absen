package com.ujian.UjianWebService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujian.UjianWebService.controller.Controller;
import com.ujian.UjianWebService.model.User;



@RestController
public class ServiceController {


	@GetMapping(path = "absensi/user/all")

	public List<User> getAllUser() {

		List<User> user = Controller.getInstance().getAllUser();
		System.out.println(user.size());
		return user;

	}

}
