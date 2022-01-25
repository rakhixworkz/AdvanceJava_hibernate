package com.xworkz.nursery.entity;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@NoArgsConstructor
@Data
@Entity
@Table(name="nursery_details")
public class NurseryEntity {
	@Id
	@Column(name="n_id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column(name="n_childName")
	private String childName;
	@Column(name="n_childAge")
	private int childAge;
	@Column(name="n_fatherName ")
	private String fatherName;
	@Column(name="n_email")
	private String email;
	@Column(name="n_address")
	private String address;
	@Column(name="n_createdBy")
	private String createdBy;
	@Column(name="n_createdAt")
	private LocalDateTime createdAt;
	public NurseryEntity(String childName, int childAge, String fatherName, String email, String address,
			String createdBy, LocalDateTime createdAt) {
		super();
		this.childName = childName;
		this.childAge = childAge;
		this.fatherName = fatherName;
		this.email = email;
		this.address = address;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}
	
}
