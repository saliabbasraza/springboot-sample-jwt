package nz.co.warehousegroup.springboot_sample.configs.security;

import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.stereotype.Component;

@Component
public class CustomAccessTokenConverter extends JwtAccessTokenConverter {
}
