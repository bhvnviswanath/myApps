package com.learning.rest.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name ="emp")
public class Employee {

	@Id
	@Column(name="EMPNO")
	private int empNo;
	
	@Column(name="ID")
	private String id;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="MGR")
	private int mgr;
	
	@Column(name="HIREDATE")
	private Timestamp hireDate;
	
	@Column(name="SAL")
	private double sal;
	
	@Column(name="COMM")
	private double comm;
	
	@Column(name="DEPTNO")
	private double deptNo;
}
