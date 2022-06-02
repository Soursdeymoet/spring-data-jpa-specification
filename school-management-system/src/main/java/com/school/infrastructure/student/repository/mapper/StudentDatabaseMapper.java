package com.school.infrastructure.student.repository.mapper;

import org.mapstruct.Mapper;

import com.school.core.student.model.result.StudentResult;
import com.school.infrastructure.student.database.entity.StudentEntity;

@Mapper(componentModel = "spring")
public interface StudentDatabaseMapper {

	/**
	 * entity to result
	 * 
	 * @param entity student entity
	 * @return result
	 */
	default StudentResult from(StudentEntity entity) {

		return StudentResult.builder().id(entity.getId()).studentId(entity.getStId())
				.studentFirstName(entity.getStFirstName()).studentLastName(entity.getStLastName())
				.studentEmail(entity.getStEmail()).studentGender(entity.getStGender())
				.studentDateOfBirth(entity.getStDateOfBirth()).build();
	}
}
