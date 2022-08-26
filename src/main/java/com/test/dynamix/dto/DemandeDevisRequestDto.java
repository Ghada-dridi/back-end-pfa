package com.test.dynamix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeDevisRequestDto {

	public Integer getNbUser() {
		return nbUser;
	}
	public void setNbUser(Integer nbUser) {
		this.nbUser = nbUser;
	}
	public String getSecteurActivite() {
		return secteurActivite;
	}
	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}
	private Integer nbUser;
    private String secteurActivite;
    private String modules;
    
}
