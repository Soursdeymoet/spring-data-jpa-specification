package com.school.application.student.model.response;

import java.util.List;

import com.school.share.model.Pagination;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class StudentListResponse {

	private List<StudentResponse> data;
	private Pagination pagination;
}
