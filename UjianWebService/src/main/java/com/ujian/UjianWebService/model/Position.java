package com.ujian.UjianWebService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "position")
public class Position {

	@Id
	private int id;
	@Column
	private String code;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Integer status;
	@Column(name = "created_by_user_id")
	private Integer createdByUserId;
	@Column(name = "created_at")
	private String createdAt;
	@Column(name = "updated_by_user_id")
	private String updatedByUserId;
	@Column(name = "updated_at")
	private String updatedAt;
	@Column(name = "deleted_by_user_id")
	private String deletedByUserId;
	@Column(name = "deleted_at")
	private String deletedAt;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personel_id")
	private Personel personel ;



	
	public Personel getPersonel() {
		return personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(Integer createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Object getUpdatedByUserId() {
		return updatedByUserId;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getDeletedByUserId() {
		return deletedByUserId;
	}

	public void setDeletedByUserId(String deletedByUserId) {
		this.deletedByUserId = deletedByUserId;
	}

	public String getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	public void setUpdatedByUserId(String updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
	}

	

}