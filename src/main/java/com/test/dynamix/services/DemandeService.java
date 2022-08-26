package com.test.dynamix.services;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.test.dynamix.dto.DemandeDevisRequestDto;
import com.test.dynamix.dto.DemandeDevisResponseDto;
import com.test.dynamix.dto.DemandeRequestDto;
import com.test.dynamix.dto.DemandeResponseDto;

public interface DemandeService {

	
	//Enregistrer  Demande ou réclamation	
		 DemandeResponseDto save(DemandeRequestDto demandeRequestDto);
		 
		 
		 //chercher Demande ou réclamation	
		 DemandeResponseDto  findById (Integer id);
		 
		 
		 
		 //supprimerDemande ou réclamation	
		 void delete(Integer id);
		 
		//Modifier Demande ou réclamation	
		 DemandeResponseDto update(DemandeRequestDto demandeRequestDto,Integer id) throws NotFoundException;
		 
		 
		 
		 List<DemandeResponseDto> findAll();

}
