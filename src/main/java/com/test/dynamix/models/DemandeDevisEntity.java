package com.test.dynamix.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "DemandesDevis")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DemandeDevisEntity implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@Column(nullable = false)
	private Integer nbUser;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private SecterActivite secteurActivite;
	
	@Column(nullable = false)
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

	public SecterActivite getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(SecterActivite secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}
	
	
	
}
