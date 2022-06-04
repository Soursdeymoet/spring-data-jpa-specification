package com.school.application.student.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.school.application.student.model.request.StudentGetRequest;
import com.school.application.student.model.response.StudentResponse;
import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.reply.StudentReply;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentApplicationMapper {
	
	
	/**
	 * from request to command
	 * 
	 * @param request
	 * @return command
	 */
	StudentGetCommand from(StudentGetRequest request);
	
	
	/**
	 * from reply to response
	 * 
	 * @param reply
	 * @return response
	 */
	StudentResponse from(StudentReply reply);
	
}
