package com.school.core.student.port.outgoing;

import java.util.Optional;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.query.StudentListQuery;
import com.school.core.student.model.result.StudentListResult;
import com.school.core.student.model.result.StudentResult;

public interface StudentProvider {
	
	/**
	 * get student by student id
	 * 
	 * @param query
	 * @return result
	 */
	Optional<StudentResult> handle(StudentGetQuery query);
	
	/**
	 * get student list by class id
	 * 
	 * @param query
	 * @return result
	 */
	Optional<StudentListResult> handle(StudentListQuery query);

}
