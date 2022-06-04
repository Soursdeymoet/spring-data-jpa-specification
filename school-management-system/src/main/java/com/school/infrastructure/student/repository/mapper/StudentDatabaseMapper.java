package com.school.infrastructure.student.repository.mapper;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.criteria.From;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

import com.school.core.student.model.result.StudentListResult;
import com.school.core.student.model.result.StudentResult;
import com.school.infrastructure.student.database.entity.StudentEntity;
import com.school.share.model.Pagination;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
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
				.studentDateOfBirth(entity.getStDateOfBirth()).status(entity.getStatus()).build();
	}
	
	/**
	 * list of entity to result
	 * 
	 * @param entities
	 * @return result
	 */
	default StudentListResult from(Page<StudentEntity> page) {
		
		final List<StudentResult> data = page.getContent().stream()
				.map(it -> from(it))
				.collect(Collectors.toList());
		
		final Pagination pagination = Pagination.builder().build();		
		
		return StudentListResult.builder()
				.data(data)
				.pagination(pagination)
				.build();	
	}
}
