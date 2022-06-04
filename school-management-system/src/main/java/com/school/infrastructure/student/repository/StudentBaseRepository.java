package com.school.infrastructure.student.repository;

import java.util.Optional;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.query.StudentListQuery;
import com.school.core.student.model.result.StudentListResult;
import com.school.core.student.model.result.StudentResult;

public interface StudentBaseRepository {

	/**
	 * get student by student id
	 * 
	 * @param query
	 * @return studentEntity
	 */
	Optional<StudentResult> handle(StudentGetQuery query);
	
	/**
	 * get list of student by class id
	 * 
	 * @param query
	 * @return StudentListResult
	 */
	Optional<StudentListResult> handle(StudentListQuery query);
}
