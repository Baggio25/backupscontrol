package com.baggio.backupscontrol.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.baggio.backupscontrol.entities.enums.ReleaseStatus;

@Entity
@Table(name = "tb_release")
public class Release implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo obrigatório")
	@Column(name = "version_number")
	private String versionNumber;
	
	@NotNull(message = "Campo obrigatório")
	@Column(name = "delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant deliveryDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "release_status")
	private ReleaseStatus releaseStatus;
	
	@NotNull(message = "Campo obrigatório")
	@ManyToOne
	@JoinColumn(name = "package_id")
	private Package packag;
	
	public Release() {
	}

	public Release(Long id, String versionNumber, Instant deliveryDate, ReleaseStatus releaseStatus, Package packag) {
		this.id = id;
		this.versionNumber = versionNumber;
		this.deliveryDate = deliveryDate;
		this.releaseStatus = releaseStatus;
		this.packag = packag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Instant getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Instant deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public ReleaseStatus getReleaseStatus() {
		return releaseStatus;
	}

	public void setReleaseStatus(ReleaseStatus releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public Package getPackag() {
		return packag;
	}
	
	public void setPackag(Package packag) {
		this.packag = packag;
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
		Release other = (Release) obj;
		return Objects.equals(id, other.id);
	}

}
