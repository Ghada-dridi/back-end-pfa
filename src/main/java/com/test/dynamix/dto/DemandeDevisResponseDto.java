package com.test.dynamix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DemandeDevisResponseDto {

	private Integer id;
	private Integer nbUser;
    private String secteurActivite;
    private String modules;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
    
    
}
