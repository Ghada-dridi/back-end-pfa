package com.test.dynamix.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.dynamix.models.DemandeDevisEntity;





@Repository
public interface DemandeDevisDao  extends JpaRepository<DemandeDevisEntity,Integer> {

	
	
}
