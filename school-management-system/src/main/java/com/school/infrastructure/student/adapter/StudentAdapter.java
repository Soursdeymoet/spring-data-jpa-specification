package com.school.infrastructure.student.adapter;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.result.StudentResult;
import com.school.core.student.port.outgoing.StudentProvider;
import com.school.infrastructure.student.repository.StudentBaseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentAdapter implements StudentProvider {
	
	private final StudentBaseRepository repository;
	
	/**
	 * get student
	 * 
	 * @param query
	 * @return result
	 */
	@Override
	public Optional<StudentResult> handle(StudentGetQuery query) {
		// TODO Auto-generated method stub
		return repository.handle(query);
	}

}
