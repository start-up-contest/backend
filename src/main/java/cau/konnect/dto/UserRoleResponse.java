package cau.konnect.dto;

import cau.konnect.domain.user.Role;
import java.util.Arrays;
import java.util.List;

public record UserRoleResponse(List<String> roleNames) {

  public static UserRoleResponse from(final Role[] roles) {
    return new UserRoleResponse(
        Arrays.stream(roles)
            .map(Role::getName)
            .toList()
    );
  }
}
