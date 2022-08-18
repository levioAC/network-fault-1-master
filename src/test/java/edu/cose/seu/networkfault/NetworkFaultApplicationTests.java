package edu.cose.seu.networkfault;

import edu.cose.seu.networkfault.controller.UserController;
import edu.cose.seu.networkfault.mapper.UserMapper;
import edu.cose.seu.networkfault.model.User;
import edu.cose.seu.networkfault.service.Impl.UserServiceImpl;
import edu.cose.seu.networkfault.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NetworkFaultApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Autowired
	UserServiceImpl userService;
	@Test
	void contextLoads() {
//		List<User> userList=userMapper.selectList(null);
//		System.out.println("---------------------------");
//		for (User user : userList) {
//			System.out.println(user);
//		}
		User user=new User(1,"123");
//		userService.register(user);
		userService.login(1,"123");
	}

}
