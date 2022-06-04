package com.school.core.student.model.result;

import java.util.List;

import com.school.share.model.Pagination;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentListResult {

	private List<StudentResult> data;
	private Pagination pagination;
}
