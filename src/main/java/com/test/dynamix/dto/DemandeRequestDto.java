package com.test.dynamix.dto;

import com.test.dynamix.models.Domaine;
import com.test.dynamix.models.TypeDemande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeRequestDto {

	
	private String objet;
	private Domaine domaine;
	private String message;
	private TypeDemande type;
}
