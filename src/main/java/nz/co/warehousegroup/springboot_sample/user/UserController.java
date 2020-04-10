package nz.co.warehousegroup.springboot_sample.user;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Api(tags = "User API")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getUsersByIds() {
        return userService.getUsersByIds();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable(name = "id", required = true) Long id) {
        return userService.get(id);
    }
}