package com.baggio.backupscontrol.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "tb_client" )
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_centrun")
	@NotNull(message = "Campo obrigatório")
	private Long idCentrun;
	
	@NotBlank(message = "Campo obrigatório")
	private String fantasy;
	
	@Column(name = "corporate_name")
	@NotBlank(message = "Campo obrigatório")
	private String corporateName;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	@NotNull(message = "Campo obrigatório")
	private City city;
		
	public Client() {
	}

	public Client(Long id, Long idCentrun, String fantasy, String corporateName, City city) {
		this.id = id;
		this.idCentrun = idCentrun;
		this.fantasy = fantasy;
		this.corporateName = corporateName;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCentrun() {
		return idCentrun;
	}

	public void setIdCentrun(Long idCentrun) {
		this.idCentrun = idCentrun;
	}

	public String getFantasy() {
		return fantasy;
	}

	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
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
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}

}
