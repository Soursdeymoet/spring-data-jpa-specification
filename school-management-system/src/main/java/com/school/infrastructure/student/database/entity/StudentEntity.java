package com.school.infrastructure.student.database.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "st_id")
	private String stId;
	
	@Column(name = "st_first_name")
	private String stFirstName;
	
	@Column(name = "st_last_name")
	private String stLastName;
	
	@Column(name = "st_email")
	private String stEmail;
	
	@Column(name = "st_gener")
	private String stGender;
	
	@Column(name = "st_date_of_birth")
	private String stDateOfBirth;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
}
