package com.m2i.formation.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "T_FORMATION_DETAIL")
public class FormationDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FD_ID")
	private Long id;
	@Column(name = "fd_support_pdf")
	private String support;
	@Column(name = "fd_table_matiere")
	private String tableMatiere;

	public FormationDetail() {

	}

	public FormationDetail(Long id) {
		this.id = id;
	}

	public FormationDetail(String support) {
		this.support = support;
	}

	public FormationDetail(Long id, String support) {
		this.id = id;
		this.support = support;
	}

	public FormationDetail(String support, String tableMatiere) {
		this.support = support;
		this.tableMatiere = tableMatiere;
	}

	// Getters et Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	public String getTableMatiere() {
		return tableMatiere;
	}

	public void setTableMatiere(String tableMatiere) {
		this.tableMatiere = tableMatiere;
	}

}
