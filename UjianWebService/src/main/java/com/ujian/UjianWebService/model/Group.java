package com.ujian.UjianWebService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "groups")
public class Group {

	@Id
	private int id;
	@Column
	private String code;
	@Column
	private String name;
	@Column(name = "project_id")
	private Integer projectId;
	@Column(name = "minimum_personnel")
	private Integer minimumPersonnel;
	@Column(name = "description")
	private String description;
	@Column(name = "attendance_qr_code")
	private String attendanceQrCode;
	@Column(name = "status")
	private Integer status;
	
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personel_id", nullable = false)
	private Personel personel ;

	public Group() {
		
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

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getMinimumPersonnel() {
		return minimumPersonnel;
	}

	public void setMinimumPersonnel(Integer minimumPersonnel) {
		this.minimumPersonnel = minimumPersonnel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttendanceQrCode() {
		return attendanceQrCode;
	}

	public void setAttendanceQrCode(String attendanceQrCode) {
		this.attendanceQrCode = attendanceQrCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Personel getPersonel() {
		return personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}
	
	
}