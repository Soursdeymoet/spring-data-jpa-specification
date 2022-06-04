package com.school.core.student.model.command;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentListCommand {

	private Integer classId;
}
