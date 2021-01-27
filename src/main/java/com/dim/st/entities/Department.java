package com.dim.st.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int deptId;
	 	
	    @Column(name = "dept_name")
	    private String deptName;
	    	    
	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="location_id")
	    private DepartmentLocations departmentLocations;
	    
	    @OneToMany(mappedBy="department",
	    		cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
	    	    		CascadeType.DETACH, CascadeType.REFRESH})
	    private List<Employee> employees;
	    
		
	    public Department() {
	    	
	    }

		public Department(String deptName) {
			super();
			this.deptName = deptName;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public DepartmentLocations getDepartmentLocations() {
			return departmentLocations;
		}

		public void setDepartmentLocations(DepartmentLocations departmentLocations) {
			this.departmentLocations = departmentLocations;
		}

		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", deptName=" + deptName + ", departmentLocations="
					+ departmentLocations + ", employees=" + employees + "]";
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}
		
		//adding convenience method for bi-directional relationship
		public void add(Employee theEmp) {
			if(employees == null) {
				employees = new ArrayList<>();
			}
			employees.add(theEmp);
			theEmp.setDepartment(this);
		}
	
}
