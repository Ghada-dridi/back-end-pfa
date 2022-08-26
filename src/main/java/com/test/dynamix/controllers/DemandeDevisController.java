package com.test.dynamix.controllers;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dynamix.dto.DemandeDevisRequestDto;
import com.test.dynamix.dto.DemandeDevisResponseDto;


import com.test.dynamix.services.DemandeDevisService;



@RestController
@RequestMapping("/api/demandesDevis")
@CrossOrigin(origins = "*")
public class DemandeDevisController {
	
	private DemandeDevisService demandeDevisService;
	
	 public DemandeDevisController(DemandeDevisService demandeDevisService) {
	        this.demandeDevisService = demandeDevisService;
	    }

	    @GetMapping
	    public List<DemandeDevisResponseDto> getDemandeDevis() {
	        return demandeDevisService.findAll();
	    }

	    @PostMapping("")
	    public DemandeDevisResponseDto save(@RequestBody() DemandeDevisRequestDto  demandeDevisRequestDto) {
	    	System.out.println("test4");
	        return demandeDevisService.save(demandeDevisRequestDto);
	    }
	    @GetMapping("/id/{id}")
	    public ResponseEntity<DemandeDevisResponseDto> findById(@PathVariable("id") Integer id) {
	        DemandeDevisResponseDto demandeResponseDto = demandeDevisService.findById(id);
	        return ResponseEntity.ok(demandeResponseDto);
	    }
	    
	    
	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        demandeDevisService.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<DemandeDevisResponseDto> update(@RequestBody() DemandeDevisRequestDto demandeRequestDto, @PathVariable() Integer id) throws NotFoundException {
	        DemandeDevisResponseDto demandeDevisResponseDto = demandeDevisService.update(demandeRequestDto, id);
	        return ResponseEntity.accepted().body(demandeDevisResponseDto);
	    }
}
