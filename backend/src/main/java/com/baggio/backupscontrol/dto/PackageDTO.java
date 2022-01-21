package com.baggio.backupscontrol.dto;

import java.io.Serializable;
import java.time.Instant;

import com.baggio.backupscontrol.entities.Package;
import com.baggio.backupscontrol.entities.enums.PackageStatus;

public class PackageDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer number;
	private String description;
	private Instant openingDate;
	private Instant endDate;
	private PackageStatus packageStatus;
	
	public PackageDTO() {

	}

	public PackageDTO(Integer id, Integer number, String description, Instant openingDate, Instant endDate,
			PackageStatus packageStatus) {
		this.id = id;
		this.number = number;
		this.description = description;
		this.openingDate = openingDate;
		this.endDate = endDate;
		this.packageStatus = packageStatus;
	}

	public PackageDTO(Package entity) {
		id = entity.getId();
		number = entity.getNumber();
		description = entity.getDescription();
		openingDate = entity.getOpeningDate();
		endDate = entity.getEndDate();
		packageStatus = entity.getPackageStatus();
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
	
}
