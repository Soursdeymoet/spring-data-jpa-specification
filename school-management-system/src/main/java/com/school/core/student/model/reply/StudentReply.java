package com.school.core.student.model.reply;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentReply {
	
	private Integer id;

	private String studentId;

	private String studentFirstName;

	private String studentLastName;

	private String studentEmail;

	private String studentGender;

	private String studentDateOfBirth;
}
