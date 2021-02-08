package com.dim.st.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;


@Entity
@Table(name="employee")
public class Employee {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "employee_id")
	    private int employeeId;

	    @Column(name = "last_name")
	    @NotBlank(message="*Must give a last name")
		@Size(min=1, max=10)
	    private String lastName;
	    
	    @Column(name = "first_name")
	    @NotBlank(message="*Must give a first name")
		@Size(min=1, max=8)
	    private String firstName;

	    @Column(name = "job")
	    @NotBlank(message="*Must give a job title")
		@Size(min=1, max=5)
	    private String job;

	    @Column(name = "mng_id")
	    private int mngId;

	    @Column(name = "salary")
	    private double salary;

	    @Column(name = "comm")
	    private double comm;
	    
	    public Employee() {
	    	  
	    }

		public Employee(String lastName, String firstName, String job, int mngId, double salary, double comm) {
			super();
			this.lastName = lastName;
			this.firstName = firstName;
			this.job = job;
			this.mngId = mngId;
			this.salary = salary;
			this.comm = comm;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

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

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", firstName=" + firstName
					+ ", job=" + job + ", mngId=" + mngId + ", salary=" + salary + ", comm=" + comm + "]";
		}

}