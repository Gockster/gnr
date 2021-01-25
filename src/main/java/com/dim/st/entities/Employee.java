package com.dim.st.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="employee")
public class Employee {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "employee_id")
	    private int employeeId;

//	    @ManyToOne
//	    @JoinColumn(name = "dept_id", nullable = false)
//	    private Department department;

	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "job")
	    private String job;

	    @Column(name = "mng_id")
	    private int mngId;

	    @Column(name = "hire_date")
	    @CreationTimestamp
	    private Date hireDate;

	    @Column(name = "salary")
	    private double salary;

	    @Column(name = "comm")
	    private double comm;

	    @Column(name = "dept_id")
	    private int deptId;
	    
	    public Employee() {
	    	  
	    }



		public Employee(int employeeId, String lastName, String firstName, String job, int mngId, Date hireDate,
				double salary, double comm, int deptId) {
			super();
			this.employeeId = employeeId;
			this.lastName = lastName;
			this.firstName = firstName;
			this.job = job;
			this.mngId = mngId;
			this.hireDate = hireDate;
			this.salary = salary;
			this.comm = comm;
			this.deptId = deptId;
		}



		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

//		public Department getDepartment() {
//			return department;
//		}
//
//		public void setDepartment(Department department) {
//			this.department = department;
//		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getMngId() {
			return mngId;
		}

		public void setMngId(int mngId) {
			this.mngId = mngId;
		}

		public Date getHireDate() {
			return hireDate;
		}

		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getComm() {
			return comm;
		}

		public void setComm(double comm) {
			this.comm = comm;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

	    
}
