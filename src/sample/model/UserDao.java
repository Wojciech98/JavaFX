package sample.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserDao {

  private static Map<UUID, User> users = new HashMap<>();

  public static void add(User user) {
    UUID id = UUID.randomUUID();
    System.out.println(id);
    user.setId(id);
    users.put(id, user);
  }

  public static boolean existsByUsername(String username) {
    return users.values().stream()
        .anyMatch(user -> user.getUsername().equals(username));
  }
}
