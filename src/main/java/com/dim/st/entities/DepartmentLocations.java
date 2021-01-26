package com.dim.st.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_locations")
public class DepartmentLocations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loc_id")
	private int deptLocationId;

	@Column(name="location_name")
	private String locationName;
	
	public DepartmentLocations() {
		
	}

	public DepartmentLocations(String locationName) {
		super();
		this.locationName = locationName;
	}

	public int getDeptLocationId() {
		return deptLocationId;
	}

	public void setDeptLocationId(int deptLocationId) {
		this.deptLocationId = deptLocationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
}
