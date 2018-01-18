package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void test111(){
		User user = new User();

		List<User> list = userService.findAll(user);
		for (User user2:list){
			System.out.println(user2.getUserName());
		}
		System.out.println("==========================================");
		user.setId(1);
		user.setUserName("java1234");
		List<User> list1 = userService.findAll(user);
		for (User user3:list1){
			System.out.println(user3.getUserName());
		}
	}
}
