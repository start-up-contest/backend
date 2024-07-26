package cau.konnect.domain.user;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {

  TUTOR("tutor"),
  TUTEE("tutee"),
  LANDLORD("landlord");

  private final String name;

  public static Role from(final String name) {
    return Arrays.stream(values())
        .filter(role -> role.name.equals(name))
        .findAny()
        .get();
  }
}
