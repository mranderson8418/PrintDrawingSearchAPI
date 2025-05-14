package com.printdrawingsearch.security;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.printdrawingsearch.service.MyUserDetailService;

/**
 * Configuration class for security settings.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class.getName());
	@Autowired

	private MyUserDetailService userDetailService;

	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	/**
	 * Configures the security filter chain.
	 *
	 * @param httpSecurity the HTTP security object
	 * @return the configured security filter chain
	 * @throws Exception if an error occurs during configuration
	 */

	// the security filter chain tells the computer which urls to pass through and
	// which to authenticate
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

		return httpSecurity.csrf(AbstractHttpConfigurer::disable)
				.cors(cors -> cors.configurationSource(corsConfigurationSource())).authorizeHttpRequests(registry -> {
					registry.requestMatchers("/api/**", "/", "/home", "/register/**", "/api/authenticate", "/logout/**",
							"/login/**", "/css/**", "/js/**", "/images/**").permitAll(); // Added paths for static resources
					registry.requestMatchers("/admin/**").hasRole("ADMIN");
					registry.requestMatchers("/user/**").hasRole("USER");
					registry.anyRequest().authenticated();
				})
				// Allow all users to access the login page (if you have one configured)
				// .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
				// Add JWT authentication filter before UsernamePasswordAuthenticationFilter
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
				// Build the security filter chain
				.build();

	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		// Allow requests from these origins
		// Example origins. replace with your origins
		configuration.setAllowedOrigins(Arrays.asList("http://127.0.0.1:5500", "http://127.0.0.1:5501", "http://localhost:3000","https://printsearch-frontend-production.up.railway.app","printsearch-frontend.railway.internal"));
		// Allow these HTTP methods
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		// Allow these headers
		configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type", "X-Requested-With", "Accept"));
		// Allow sending credentials (cookies, authentication headers)
		configuration.setAllowCredentials(true);
		// Apply this configuration to all endpoints
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

	/**
	 * Provides the user details service.
	 *
	 * @return the user details service
	 */
	@Bean
	public UserDetailsService userDetailsService() {
		return userDetailService;
	}

	/**
	 * Provides the authentication provider.
	 *
	 * @return the authentication provider
	 */
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		// set the userDetailsService for authentication
		provider.setUserDetailsService(userDetailService);
		// Set password encoder (which is BCryptPasswordEncoder)
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}

	/**
	 * Creates an AuthenticationManager bean.
	 *
	 * @return the authentication manager
	 */
	@Bean
	public AuthenticationManager authenticationManager() {
		// Create AuthenticationManager using the configured authentication provider
		return new ProviderManager(authenticationProvider());
	}

	/**
	 * Provides the password encoder.
	 *
	 * @return the password encoder
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		// Use BCryptPasswordEncoder for password encoding
		return new BCryptPasswordEncoder();
	}
}