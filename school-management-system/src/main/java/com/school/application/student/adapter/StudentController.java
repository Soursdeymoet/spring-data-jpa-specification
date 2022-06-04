package com.school.application.student.adapter;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.school.application.student.adapter.rest.StudentRest;
import com.school.application.student.mapper.StudentApplicationMapper;
import com.school.application.student.model.request.StudentGetRequest;
import com.school.application.student.model.response.StudentResponse;
import com.school.core.student.port.incoming.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController implements StudentRest {
	
	private final StudentService service;
	private final StudentApplicationMapper mapper;

	/**
	 * get student
	 * 
	 * @param request
	 * @return response
	 */
	@Override
	public ResponseEntity<StudentResponse> get(StudentGetRequest request) {
		// TODO Auto-generated method stub
		return service.handle(mapper.from(request))
				.map(mapper::from)
				.map(response -> new ResponseEntity<>(response, HttpStatus.OK))
				.orElseThrow();
	}

}
