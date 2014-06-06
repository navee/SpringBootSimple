package org.navee.springboot.sample.service;


import org.navee.springboot.sample.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DepartmentService {
	
	public Page<Department> findAll (Pageable pageable);
}
