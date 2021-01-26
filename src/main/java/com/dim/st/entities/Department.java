package com.dim.st.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	    
	    @Column(name = "location_id")
	    private int locationId;
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    private DepartmentLocations departmentLocations;
	    
		
	    public Department() {
	    	
	    }

		public Department(String deptName, int locationId) {
			super();
			this.deptName = deptName;
			this.locationId = locationId;
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

		public int getLocationId() {
			return locationId;
		}

		public void setLocationId(int locationId) {
			this.locationId = locationId;
		}

		
	    
	    

}
