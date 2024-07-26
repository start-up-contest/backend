package cau.konnect.domain.user;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {

  private Long id;
  private final String email;
  private final String password;
  private final Role role;

  @Builder
  public User(final String email, final String password, final Role role) {
    this.email = email;
    this.password = password;
    this.role = role;
  }

  public void assignId(final Long id) {
    this.id = id;
  }
}
