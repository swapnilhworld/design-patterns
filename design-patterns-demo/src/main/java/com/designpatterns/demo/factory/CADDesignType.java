package com.designpatterns.demo.factory;

import java.util.function.Supplier;

public enum CADDesignType {

	COMPONENT(Component::new),
	ASSEMBLY(Assembly::new);
	

	CADDesignType(Supplier<CADDesign> constructor) {
		// TODO Auto-generated constructor stub
		this.constructor = constructor;
	}

	private final Supplier<CADDesign> constructor;

	public Supplier<CADDesign> getConstructor() {
		return constructor;
	}

}
