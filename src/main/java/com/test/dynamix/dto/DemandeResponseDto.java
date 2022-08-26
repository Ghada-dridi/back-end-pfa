package com.test.dynamix.dto;

import com.test.dynamix.models.Domaine;
import com.test.dynamix.models.TypeDemande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DemandeResponseDto {
	
	
	private Integer id;
	private String objet;
	private Domaine domaine;
	private String message;
	private TypeDemande type;
	
	
}
