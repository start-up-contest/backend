package cau.konnect.dto;

import cau.konnect.domain.user.Role;
import cau.konnect.domain.user.User;

public record UserCreateRequest(String email, String password, String role) {

  public User toUser() {
    return User.builder()
        .email(email)
        .password(password)
        .role(Role.from(role))
        .build();
  }
}
