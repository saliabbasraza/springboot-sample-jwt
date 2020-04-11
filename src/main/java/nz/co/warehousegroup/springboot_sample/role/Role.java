package nz.co.warehousegroup.springboot_sample.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @Transient
    @Override
    public String getAuthority() {
        return name;
    }


    @JsonIgnore
    @OneToMany(mappedBy = "role")
    private Set<UserRole> userRoles;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
