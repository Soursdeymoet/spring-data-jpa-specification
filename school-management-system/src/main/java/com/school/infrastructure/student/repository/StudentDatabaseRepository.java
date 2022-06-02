package com.school.infrastructure.student.repository;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.result.StudentResult;
import com.school.infrastructure.student.database.entity.StudentEntity;
import com.school.infrastructure.student.database.repository.StudentRepository;
import com.school.infrastructure.student.database.specification.StudentSpecification;
import com.school.infrastructure.student.repository.mapper.StudentDatabaseMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class StudentDatabaseRepository implements StudentBaseRepository {

	private final StudentRepository repository;
	private final StudentDatabaseMapper mapper;

	/**
	 * get student by student id
	 * 
	 * @param query student get query
	 * @return result
	 */
	@Override
	public Optional<StudentResult> handle(StudentGetQuery query) {

		Specification<StudentEntity> specification = Specification
				.where(StudentSpecification.studentIdEqual(query.getStudentId()));

		StudentEntity entity = repository.findOne(specification)
				.orElseThrow(() -> new EntityNotFoundException(query.getStudentId()));

		return Optional.of(entity)
				.map(mapper::from);
	}

}
