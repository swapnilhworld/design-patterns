package com.designpatterns.demo.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {

	private final CADDesignFactory factory;

	@Autowired
	public FactoryController(CADDesignFactory factory) {
		this.factory= factory;
	}

	@GetMapping(value = "/design")
	public CADDesign getDesign(@RequestParam String type) {
		CADDesign design = factory.getDesign(CADDesignType.valueOf(type));
		return design;
	}
}


