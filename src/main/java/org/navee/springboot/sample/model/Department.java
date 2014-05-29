package org.navee.springboot.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_dept")
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3357252148790317464L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name",nullable=false)
	private String name;

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
}
