package cau.konnect.domain.repository;

import cau.konnect.domain.user.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

  private static Long USER_ID = 1L;
  private static final Map<Long, User> STORE = new HashMap<>();

  public void save(final User user) {
    user.assignId(USER_ID++);
    STORE.put(user.getId(), user);
  }

  public Optional<User> findById(final Long id) {
    return Optional.ofNullable(STORE.get(id));
  }
}
