package com.school.application.student.model.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentResponse {

	private Integer id;

	private String studentId;

	private String studentFirstName;

	private String studentLastName;

	private String studentEmail;

	private String studentGender;

	private String studentDateOfBirth;
}
