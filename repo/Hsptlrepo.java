package com.spec.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spec.entity.Hsptlentity;

public interface Hsptlrepo extends JpaRepository<Hsptlentity,Integer>{

	Hsptlentity getByPid(int id);
}



