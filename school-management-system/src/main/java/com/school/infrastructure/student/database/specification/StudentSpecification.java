package com.school.infrastructure.student.database.specification;

import java.util.Objects;

import org.springframework.data.jpa.domain.Specification;

import com.school.infrastructure.student.database.entity.StudentEntity;

public class StudentSpecification {
	
	/**
	 * get student by id
	 * 
	 * @param id
	 * @return specification
	 */
	public Specification<StudentEntity> idEqual(Integer id) {
		
		if (Objects.isNull(id)) return null;
		
		return (root, query, builder) -> builder.equal(root.get("id"), id);
	}
	
	/**
	 * get student by student id
	 * 
	 * @param studentId
	 * @return specification
	 */
	public Specification<StudentEntity> studentIdEqual(String studentId) {
		
		if (Objects.isNull(studentId)) return null;
		
		return (root, query, builder) -> builder.equal(builder.lower(root.get("stId")), studentId.toLowerCase());
	}
}
