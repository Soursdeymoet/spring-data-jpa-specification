package com.school.application.student.adapter.rest;

import org.springframework.http.ResponseEntity;

import com.school.application.student.model.request.StudentGetRequest;
import com.school.application.student.model.request.StudentListRequest;
import com.school.application.student.model.response.StudentListResponse;
import com.school.application.student.model.response.StudentResponse;

public interface StudentRest {
	
	/**
	 * get student
	 * 
	 * @param request
	 * @return response
	 */
	ResponseEntity<StudentResponse> get(StudentGetRequest request);
	
	/**
	 * get list of student by class id
	 * 
	 * @param request
	 * @return response
	 */
	ResponseEntity<StudentListResponse> list(StudentListRequest request);
}
