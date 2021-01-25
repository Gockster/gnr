package com.dim.st.entities;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Department {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private int deptId;

    @Column(name = "dept_name")
    private String deptName;
    
//    @Column(name = "location_id")
//    private String locationId;
    
    

//    @ManyToOne
//    @JoinColumn(name = "location_id", nullable = false)
//    private DepartmentLocations departmentLocations;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy ="department")
//    private Set<Employee> employees;
}


