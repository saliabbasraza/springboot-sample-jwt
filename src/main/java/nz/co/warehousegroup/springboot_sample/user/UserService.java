package nz.co.warehousegroup.springboot_sample.user;

import java.util.List;

public interface UserService {

    List<UserDto> getUsersByIds();

    UserDto get(Long id);

    UserDto signup(UserDto user);
}
