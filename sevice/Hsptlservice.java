package com.spec.sevice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entity.Hsptlentity;
import com.spec.repo.Hsptlrepo;

@Service
public class Hsptlservice {
	
	@Autowired
	Hsptlrepo hsptlrepo;
	

	public Hsptlentity addHspltodb(Hsptlentity hspl) {
		return hsptlrepo.save(hspl);
		
	}

	public Hsptlentity getPatientById( int id) {
		return hsptlrepo.getByPid(id);
	}

}