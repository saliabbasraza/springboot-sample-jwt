package nz.co.warehousegroup.springboot_sample;

import io.swagger.annotations.ApiOperation;
import nz.co.warehousegroup.springboot_sample.user.UserDto;
import nz.co.warehousegroup.springboot_sample.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiOperation(value = "Base path of API")
@RequestMapping("/signup")
@RestController
public class SignupController {

    private final UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    UserDto signup(@RequestBody UserDto userDto) {
        return userService.signup(userDto);
    }

}
