package com.designpatterns.demo.factory;

import jakarta.persistence.Id;

public class Assembly implements CADDesign{


	public static final String DEFAULT_TYPE="Assembly";
	
	@Id
	private Long id;
	private String name;
	private String type;

	
    public Assembly(Long id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}


	public Assembly() {
        this.type = DEFAULT_TYPE;
        this.id = (long) 1;
        this.name = "ASM-0001";
    }
    
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public void setType(String type) {
		this.type = type;
	}


	public String getType() {
		return type;
	}


	@Override
	public void info() {
		System.out.println("This is an assembly!");
	}


}
