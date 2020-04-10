package nz.co.warehousegroup.springboot_sample;

import io.swagger.annotations.ApiOperation;
import nz.co.warehousegroup.springboot_sample.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@ApiOperation(value = "Base path of API")
@RequestMapping("")
@RestController
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    String index(HttpServletRequest request) {
        String hostName = "";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Greetings from Spring Boot || Running on " + hostName;
    }
}
