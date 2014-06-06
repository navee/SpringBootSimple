package org.navee.springboot.sample.dao;

import org.navee.springboot.sample.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department,Long> {
	Page<Department> findAll(Pageable pageable);
}
