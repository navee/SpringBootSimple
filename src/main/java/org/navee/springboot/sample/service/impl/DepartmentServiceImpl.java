package org.navee.springboot.sample.service.impl;

import org.navee.springboot.sample.dao.DepartmentRepository;
import org.navee.springboot.sample.model.Department;
import org.navee.springboot.sample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Page<Department> findAll(Pageable pageable) {
		return departmentRepository.findAll(pageable);
	}
	

}
