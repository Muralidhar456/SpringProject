package com.bookmanagement.OnlineBookManagement.Users;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class User {
  
  private String FirstName;
  
  private String LasttName;
 
  private String Email;
  
  private long PhoneNumber;

  @Id
  private String AccountName;

  public String getFirstName() {
    return FirstName;
  }
  public void setFirstName(String firstName) {
    FirstName = firstName;
  }
  public String getLasttName() {
    return LasttName;
  }
  public void setLasttName(String lasttName) {
    LasttName = lasttName;
  }
  public String getEmail() {
    return Email;
  }
  public void setEmail(String email) {
    Email = email;
  }
  public long getPhoneNumber() {
    return PhoneNumber;
  }
  public void setPhoneNumber(long phoneNumber) {
    PhoneNumber = phoneNumber;
  }
  public String getAccountName() {
    return AccountName;
  }
  public void setAccountName(String accountName) {
    AccountName = accountName;
  }  
}
