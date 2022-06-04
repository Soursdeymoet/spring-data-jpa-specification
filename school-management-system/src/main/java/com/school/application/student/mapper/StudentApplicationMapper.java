package com.school.application.student.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.school.application.student.model.request.StudentGetRequest;
import com.school.application.student.model.request.StudentListRequest;
import com.school.application.student.model.response.StudentListResponse;
import com.school.application.student.model.response.StudentResponse;
import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.command.StudentListCommand;
import com.school.core.student.model.reply.StudentListReply;
import com.school.core.student.model.reply.StudentReply;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentApplicationMapper {
	
	
	/**
	 * from get request to command
	 * 
	 * @param request
	 * @return command
	 */
	StudentGetCommand from(StudentGetRequest request);
	
	/**
	 * from list request to command
	 * 
	 * @param request
	 * @return command
	 */
	StudentListCommand from(StudentListRequest request);
	
	
	/**
	 * from reply to response
	 * 
	 * @param reply
	 * @return response
	 */
	StudentResponse from(StudentReply reply);
	
	/**
	 * from list of reply to response
	 * 
	 * @param reply
	 * @return response
	 */
	StudentListResponse from(StudentListReply reply);
	
}
