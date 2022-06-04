package com.school.core.student.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.query.StudentGetQuery;
import com.school.core.student.model.reply.StudentReply;
import com.school.core.student.model.result.StudentResult;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentCoreMapper {

	/**
	 * from command to query
	 * 
	 * @param command
	 * @return query
	 */
	StudentGetQuery from(StudentGetCommand command);
	
	/**
	 * from result to reply
	 * 
	 * @param result
	 * @return reply
	 */
	StudentReply from(StudentResult result);
}
