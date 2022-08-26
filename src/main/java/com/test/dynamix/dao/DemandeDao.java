package com.test.dynamix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.test.dynamix.models.DemandeEntity;


@Repository
public interface DemandeDao  extends JpaRepository<DemandeEntity,Integer> {

}
