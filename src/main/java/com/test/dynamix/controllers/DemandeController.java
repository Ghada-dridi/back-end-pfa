package com.test.dynamix.controllers;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.test.dynamix.dto.DemandeResponseDto;
import com.test.dynamix.dto.DemandeRequestDto;
import com.test.dynamix.services.DemandeService;

@RestController
@RequestMapping("/api/demandes")
public class DemandeController {
	
	private DemandeService demandeService;
	
	 public DemandeController(DemandeService demandeService) {
	        this.demandeService = demandeService;
	    }

	    @GetMapping
	    public List<DemandeResponseDto> getDemandeDevis() {
	        return demandeService.findAll();
	    }

	    @PostMapping("")
	    public DemandeResponseDto save(@RequestBody() DemandeRequestDto  demandeRequestDto) {
	    	System.out.println("test4");
	    	
	        return demandeService.save(demandeRequestDto);
	    }
	    @GetMapping("/id/{id}")
	    public ResponseEntity<DemandeResponseDto> findById(@PathVariable("id") Integer id) {
	        DemandeResponseDto demandeResponseDto = demandeService.findById(id);
	        return ResponseEntity.ok(demandeResponseDto);
	    }
	    
	    
	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        demandeService.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<DemandeResponseDto> update(@RequestBody() DemandeRequestDto demandeDevisRequestDto, @PathVariable() Integer id) throws NotFoundException {
	        DemandeResponseDto demandeResponseDto = demandeService.update(demandeDevisRequestDto, id);
	        return ResponseEntity.accepted().body(demandeResponseDto);
	    }
}
