package com.baggio.backupscontrol.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.baggio.backupscontrol.entities.enums.PackageStatus;

@Entity
@Table(name = "tb_package")
public class Package implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "Campo obrigatório")
	private Integer number;
	
	@NotBlank(message = "Campo obrigatório")
	private String description;
	
	@Column(name = "opening_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant openingDate;
	
	@Column(name = "end_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant endDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "package_status")
	private PackageStatus packageStatus;
	
	@OneToMany(mappedBy = "packag")
	private List<Release> releases = new ArrayList<>();
	
	public Package() {

	}

	public Package(Integer id, Integer number, String description, Instant openingDate, Instant endDate,
			PackageStatus packageStatus) {
		this.id = id;
		this.number = number;
		this.description = description;
		this.openingDate = openingDate;
		this.endDate = endDate;
		this.packageStatus = packageStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Instant openingDate) {
		this.openingDate = openingDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}

	public PackageStatus getPackageStatus() {
		return packageStatus;
	}

	public void setPackageStatus(PackageStatus packageStatus) {
		this.packageStatus = packageStatus;
	}
	
	public List<Release> getReleases() {
		return releases;
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
		Package other = (Package) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
