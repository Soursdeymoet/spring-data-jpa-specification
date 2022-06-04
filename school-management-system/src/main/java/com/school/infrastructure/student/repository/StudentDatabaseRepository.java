package com.school.infrastructure.student.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.query.StudentListQuery;
import com.school.core.student.model.result.StudentListResult;
import com.school.core.student.model.result.StudentResult;
import com.school.infrastructure.student.database.entity.ClassStudentEntity;
import com.school.infrastructure.student.database.entity.StudentEntity;
import com.school.infrastructure.student.database.repository.ClassStudentRepository;
import com.school.infrastructure.student.database.repository.StudentRepository;
import com.school.infrastructure.student.database.specification.ClassStudentSpecification;
import com.school.infrastructure.student.database.specification.StudentSpecification;
import com.school.infrastructure.student.repository.mapper.StudentDatabaseMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class StudentDatabaseRepository implements StudentBaseRepository {

	private final StudentRepository studentRepository;
	private final ClassStudentRepository classStudentRepository;
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

		StudentEntity entity = studentRepository.findOne(specification)
				.orElseThrow(() -> new EntityNotFoundException(query.getStudentId()));

		return Optional.of(entity).map(mapper::from);
	}

	@Override
	public Optional<StudentListResult> handle(StudentListQuery query) {
		// TODO Auto-generated method stub
		Specification<ClassStudentEntity> classStudentSpec = Specification
				.where(ClassStudentSpecification.classIdEqual(query.getClassId()));

		List<Integer> ids = classStudentRepository.findAll(classStudentSpec).stream().map(it -> it.getStId())
				.collect(Collectors.toList());
		
		Specification<StudentEntity> specification = StudentSpecification.idIn(ids);
		
		Pageable pageable = 
				  PageRequest.of(0, 3);
		
		Page<StudentEntity> students = studentRepository.findAll(specification, pageable);

		return Optional.of(students)
				.map(mapper::from);
	}

}
