package com.designpatterns.demo.factory;

import org.springframework.stereotype.Component;

@Component
public class CADDesignFactory {

	public CADDesign getDesign(CADDesignType type) {
		
//		if(type.equalsIgnoreCase("component"))
//			return new Component();
//		else if (type.equalsIgnoreCase("assembly"))
//			return new Assembly();
//		else
//			throw new IllegalArgumentException("Unknown design type: " + type);
		return type.getConstructor().get();
				
				
		
	}
}
