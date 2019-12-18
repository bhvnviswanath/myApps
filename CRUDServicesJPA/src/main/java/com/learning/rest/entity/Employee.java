package com.learning.rest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="emp")
public class Employee {

	@Id
	@Column(name="EMPNO")
	private Integer empNo;
	
	@Column(name="ENAME")
	private String eName;
	
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
