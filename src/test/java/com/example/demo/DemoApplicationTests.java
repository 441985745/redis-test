package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindAll() {
        User user = new User();

        List<User> list = userService.findAll(user);
        List<User> list4 = userService.findAll(user);
        for (User user2 : list) {
            System.out.println(user2.getUserName());
        }
        System.out.println("==========================================");
        user.setId(1);
        user.setUserName("java1234");
        List<User> list1 = userService.findAll(user);
        for (User user3 : list1) {
            System.out.println(user3.getUserName());
        }
    }

    @Test
    public void activitiStartTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "朱帅");
        //map.put("admin","张淑龙");
        runtimeService.startProcessInstanceByKey("study", map);

    }

    @Test
    public void complete() {
        Map<String, Object> map = new HashMap<>();
        map.put("admin", "张淑龙");
        //taskService.setAssignee("","");修改审批人
        runtimeService.setVariable("2501", "admin", map);
        taskService.complete("2505");
    }
}
