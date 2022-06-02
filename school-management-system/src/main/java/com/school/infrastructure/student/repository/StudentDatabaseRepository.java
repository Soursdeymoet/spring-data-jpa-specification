package com.school.infrastructure.student.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.result.StudentResult;

@Repository
public class StudentDatabaseRepository implements StudentBaseRepository {

	@Override
	public Optional<StudentResult> handle(StudentGetQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
