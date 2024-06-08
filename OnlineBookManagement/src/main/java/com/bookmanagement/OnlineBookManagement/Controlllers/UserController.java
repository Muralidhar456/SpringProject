package com.bookmanagement.OnlineBookManagement.Controlllers;
import com.bookmanagement.OnlineBookManagement.Service.UserService;
import com.bookmanagement.OnlineBookManagement.Users.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  UserService service;

  public UserController(UserService service) {
    this.service=service;
  }

  @GetMapping("/users")
  public List<User> getUsers(){
    return service.getUsers();
  }

  @PostMapping("/users/create")
  public String CreateUser(@RequestBody User user){
    service.createUser(user);
    return "User Created " + user.getAccountName();
  }

  @GetMapping
  public String sayHello(){
    return "hello world";
  }
}
