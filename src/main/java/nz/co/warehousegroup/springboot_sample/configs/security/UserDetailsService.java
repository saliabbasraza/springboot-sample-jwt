package nz.co.warehousegroup.springboot_sample.configs.security;

import nz.co.warehousegroup.springboot_sample.user.User;
import nz.co.warehousegroup.springboot_sample.user.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository repository;

    public UserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return user;
    }
}
