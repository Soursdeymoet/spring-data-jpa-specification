package com.school.core.student.port.outgoing;

import java.util.Optional;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.result.StudentResult;

public interface StudentProvider {
	
	Optional<StudentResult> handle(StudentGetQuery query);

}
