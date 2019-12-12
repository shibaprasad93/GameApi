package com.game.api.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("admin".equals(username)) {
			return new User("admin", "$2y$12$8F40PVLQOWt9z9RelH5Tfu2QYNX4juYSugXSZ.QxS.20Xd22.Zkmi",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
