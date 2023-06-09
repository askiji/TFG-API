package com.ramon.guardiasapi.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class User {
  @Id
  private String id;
  private String username;
  private String email;
  private String password;
  private Set<String> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password, Set<String> roles) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.roles = roles;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRoles() {
    return roles;
  }

  public void setRoles(Set<String> roles) {
    this.roles = roles;
  }
}