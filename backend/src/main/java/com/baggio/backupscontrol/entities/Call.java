package com.baggio.backupscontrol.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_call")
public class Call implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Campo obrigatório")
	private Integer number;

	@NotBlank(message = "Campo obrigatório")
	@Column(name = "link_centrun")
	private String linkCentrun;

	@NotBlank(message = "Campo obrigatório")
	@Column(columnDefinition = "TEXT")
	private String summary;
	
	@ManyToOne
	@JoinColumn(name = "release_id")
	@NotNull(message = "Campo obrigatório")
	private Release release;

	@ManyToMany
	@JoinTable(name = "tb_call_system", joinColumns = @JoinColumn(name = "call_id"), inverseJoinColumns = @JoinColumn(name = "system_id"))
	Set<System> systems = new HashSet<>();

	public Call() {

	}

	public Call(Long id, Integer number, String linkCentrun, Release release, String summary) {
		this.id = id;
		this.number = number;
		this.linkCentrun = linkCentrun;
		this.release = release;
		this.summary = summary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getLinkCentrun() {
		return linkCentrun;
	}

	public void setLinkCentrun(String linkCentrun) {
		this.linkCentrun = linkCentrun;
	}

	public String getSummary() {
		return summary;
	}

	public Release getRelease() {
		return release;
	}
	
	public void setRelease(Release release) {
		this.release = release;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Set<System> getSystems() {
		return systems;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Call other = (Call) obj;
		return Objects.equals(id, other.id);
	}

}
