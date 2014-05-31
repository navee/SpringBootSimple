package org.navee.springboot.sample.service;

import org.navee.springboot.sample.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
	public Page<User> findAll(Pageable pageable);

	public User findById(Long id);
}
