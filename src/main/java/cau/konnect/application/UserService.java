package cau.konnect.application;

import cau.konnect.domain.repository.UserRepository;
import cau.konnect.domain.user.User;
import cau.konnect.dto.UserCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public void register(final UserCreateRequest request) {
    final User user = request.toUser();
    userRepository.save(user);
  }
}
