package cau.konnect.controller;

import cau.konnect.application.UserService;
import cau.konnect.domain.user.Role;
import cau.konnect.dto.UserCreateRequest;
import cau.konnect.dto.UserRoleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/register")
  public ResponseEntity<Void> register(@RequestBody final UserCreateRequest request) {
    userService.register(request);
    return ResponseEntity.ok().build();
  }

  @GetMapping("/role")
  public ResponseEntity<UserRoleResponse> getUserRoles() {
    final var response = UserRoleResponse.from(Role.values());
    return ResponseEntity.ok(response);
  }
}
