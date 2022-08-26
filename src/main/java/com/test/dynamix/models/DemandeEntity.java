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
@Table(name = "Demandes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class DemandeEntity implements Serializable {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String objet;
	
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Domaine domaine;
	
	
	@Column(nullable = false)
	private String message;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TypeDemande type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TypeDemande getType() {
		return type;
	}

	public void setType(TypeDemande type) {
		this.type = type;
	}
	
	

}
