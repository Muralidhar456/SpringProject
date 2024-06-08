package com.bookmanagement.OnlineBookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmanagement.OnlineBookManagement.Users.User;

public interface UserRepository extends JpaRepository<User,String>{
   
}
