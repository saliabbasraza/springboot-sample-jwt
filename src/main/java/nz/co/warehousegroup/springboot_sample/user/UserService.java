package nz.co.warehousegroup.springboot_sample.user;

import java.util.Optional;

public interface UserService {

    Iterable<User> getUsersByIds();

    Optional<User> get(Long id);

    User signup(String email, String password);
}
