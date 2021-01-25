package com.dim.st.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "dept_id")
	    private int deptId;
	 	
	    @Column(name = "dept_name")
	    private String deptName;
	    
	    @Column(name = "location_id")
	    private int locationId;
	    
	    public Department() {
	    	
	    }

		public Department(int deptId, String deptName, int locationId) {
			super();
			this.deptId = deptId;
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

		public void setLocationId(int loacationId) {
			this.locationId = locationId;
		}
	    
	    

}
