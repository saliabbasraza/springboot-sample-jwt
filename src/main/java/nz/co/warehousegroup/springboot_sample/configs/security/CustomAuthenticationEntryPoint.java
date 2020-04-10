package nz.co.warehousegroup.springboot_sample.configs.security;

import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationEntryPoint extends OAuth2AuthenticationEntryPoint {
}
