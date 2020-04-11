package nz.co.warehousegroup.springboot_sample.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotEmpty
    private List<String> roles;
}
