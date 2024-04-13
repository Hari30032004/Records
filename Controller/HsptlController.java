package com.spec.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spec.entity.Hsptlentity;
import com.spec.sevice.Hsptlservice;

@RestController
@RequestMapping("/real")
public class HsptlController{
	@Autowired
	Hsptlservice hsptlservice;
	
	@PostMapping("/hsptl/add")
	public Hsptlentity addNewHsptl(@RequestBody Hsptlentity hsptl) {

		return hsptlservice.addHspltodb(hsptl);
	}
	@GetMapping("/hsptl/{id}")
	public Hsptlentity getHsplentityByid(@PathVariable int id) {
		
		return hsptlservice.getPatientById(id);
	}

}