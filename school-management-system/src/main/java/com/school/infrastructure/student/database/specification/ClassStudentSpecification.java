package com.school.infrastructure.student.database.specification;

import java.util.Objects;

import org.springframework.data.jpa.domain.Specification;

import com.school.infrastructure.student.database.entity.ClassStudentEntity;

public class ClassStudentSpecification {

	/**
	 * get student id by class id
	 * 
	 * @param classId
	 * @return specification
	 */
	public static Specification<ClassStudentEntity> classIdEqual(Integer classId) {
		
		if (Objects.isNull(classId)) return null;
		
		return (root, query, builder) -> builder.equal(root.get("classId"), classId);
	}
}
