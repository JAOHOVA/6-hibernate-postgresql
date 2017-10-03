package com.m2i.formation.dao.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name = "T_FORMATION")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FORMATION_ID")
	private Long id;
	@Column(name = "FORMATION_THEME")
	private String theme;
	
	@OneToOne(cascade = CascadeType.ALL)
	private FormationDetail formationDetail;

	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "T_FORMATION_TP", joinColumns = { @JoinColumn(name = "FORMATION_ID") }, inverseJoinColumns = {
    @JoinColumn(name = "TP_ID") })
	private Set<TravauxPratiques> formationTps = new HashSet<TravauxPratiques>(0);

	// Constructeurs
	public Formation() {

	}

	public Formation(Long id) {
		this.id = id;
	}

	public Formation(String theme) {
		this.theme = theme;
	}

	public Formation(Long id, String theme) {
		this.id = id;
		this.theme = theme;
	}

	public Formation(String theme, Set<TravauxPratiques> formationTps) {
		this.theme = theme;
		this.formationTps = formationTps;
	}

	public FormationDetail getFormationDetail() {
		return formationDetail;
	}

	public void setFormationDetail(FormationDetail formationDetail) {
		this.formationDetail = formationDetail;
	}

	public Formation(String theme, FormationDetail formationDetail, Set<TravauxPratiques> formationTps) {
		this.theme = theme;
		this.formationDetail = formationDetail;
		this.formationTps = formationTps;
	}

	public Set<TravauxPratiques> getFormationTps() {
		return formationTps;
	}

	// Getters et Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setFormationTps(Set<TravauxPratiques> formationTps) {
		this.formationTps = formationTps;
	}
}
