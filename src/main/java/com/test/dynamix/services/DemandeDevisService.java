package com.test.dynamix.services;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.test.dynamix.dto.DemandeDevisRequestDto;
import com.test.dynamix.dto.DemandeDevisResponseDto;



public interface DemandeDevisService {
	//Enregistrer  Demande devis 	
	 DemandeDevisResponseDto save(DemandeDevisRequestDto demandeDevisRequestDto);
	 
	 
	 //chercher Demande Devis par id
	 DemandeDevisResponseDto  findById (Integer id);
	 
	 
	 
	 //supprimer  Demande Devis
	 void delete(Integer id);
	 
	//Modifier  Demande Devis
	 DemandeDevisResponseDto update(DemandeDevisRequestDto demandeDevisRequestDto,Integer id) throws NotFoundException;
	 
	 
	 
	 List<DemandeDevisResponseDto> findAll();




}
