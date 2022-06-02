package com.school.core.student.model.result;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentResult {

	private Integer id;

	private String studentId;

	private String studentFirstName;

	private String studentLastName;

	private String studentEmail;

	private String studentGender;

	private String studentDateOfBirth;
}
