package com.m2i.formation.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "T_TPC")
public class TpCorrection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TC_ID")
	private Long id;
	@Column(name = "TC_CORRECTION")
	private String correction;

	// Constructeurs
	public TpCorrection() {

	}

	public TpCorrection(Long id) {
		this.id = id;
	}

	public TpCorrection(String correction) {
		this.correction = correction;
	}

	public TpCorrection(Long id, String correction) {
		this.id = id;
		this.correction = correction;
	}

	// Getters et Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorrection() {
		return correction;
	}

	public void setCorrection(String correction) {
		this.correction = correction;
	}

}
