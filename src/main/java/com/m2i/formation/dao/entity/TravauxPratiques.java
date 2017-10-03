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
import javax.persistence.OneToMany;

@Entity(name = "T_TP")
public class TravauxPratiques {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TP_ID")
	private Long tpId;
	@Column(name = "TP_SUBJECT")
	private String tpSubject;
	@Column(name = "TP_DURATION")
	private Long tpDuration;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "T_TP_TC", joinColumns = { @JoinColumn(name = "TP_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "TC_ID") })
	private Set<TpCorrection> formationTpc = new HashSet<TpCorrection>(0);

	public TravauxPratiques(String tpSubject, Long tpDuration, Set<TpCorrection> formationTpc) {
		this.tpSubject = tpSubject;
		this.tpDuration = tpDuration;
		this.formationTpc = formationTpc;
	}

	public TravauxPratiques() {
	}

	public TravauxPratiques(String tpSubject, Long tpDuration) {

		this.tpSubject = tpSubject;
		this.tpDuration = tpDuration;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSubject() {
		return tpSubject;
	}

	public void setTpSubject(String tpSubject) {
		this.tpSubject = tpSubject;
	}

	public Long getTpDuration() {
		return tpDuration;
	}

	public void setTpDuration(Long tpDuration) {
		this.tpDuration = tpDuration;
	}

	public Set<TpCorrection> getFormationTpc() {
		return formationTpc;
	}

	public void setFormationTpc(Set<TpCorrection> formationTpc) {
		this.formationTpc = formationTpc;
	}
}
