package com.school.application.student.model.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentGetRequest {

	private String studentId;
}
