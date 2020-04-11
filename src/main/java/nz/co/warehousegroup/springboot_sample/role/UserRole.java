package nz.co.warehousegroup.springboot_sample.role;

import lombok.ToString;
import nz.co.warehousegroup.springboot_sample.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserRole {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    @ToString.Exclude
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public UserRole() {
    }

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}
