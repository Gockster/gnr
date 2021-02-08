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
@Table(name="department")
public class Department {
	
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	    private int deptId;
	 	
	 	
	    @Column(name = "dept_name")
	    @NotBlank(message="*Must give a departments name")
		@Size(min=1, max=10)
	    private String deptName;
	    	    
	    @Column(name = "dept_description")
	    @NotBlank(message="*Must give a departments description dude")
		@Size(min=1, max=15)
	    private String deptDescription;
	    
	    public Department() {
	    	
	    }

		public Department(String deptName, String deptDescription) {
			super();
			this.deptName = deptName;
			this.deptDescription = deptDescription;
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

		public String getDeptDescription() {
			return deptDescription;
		}

		public void setDeptDescription(String deptDescription) {
			this.deptDescription = deptDescription;
		}

		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptDescription=" + deptDescription
					+ "]";
		}
	    
}


