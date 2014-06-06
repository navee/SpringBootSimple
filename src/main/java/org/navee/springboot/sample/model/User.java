package org.navee.springboot.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="t_user")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6434615419658130236L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	@NotEmpty(message="用户名不能为空")//hibernate validate 暂时还不生效
	private String name;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
