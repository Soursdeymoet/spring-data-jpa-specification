package com.school.infrastructure.student.repository;

import java.util.Optional;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.result.StudentResult;

public interface StudentBaseRepository {

	/**
	 * get student by student id
	 * 
	 * @param query
	 * @return studentEntity
	 */
	Optional<StudentResult> handle(StudentGetQuery query);
}
