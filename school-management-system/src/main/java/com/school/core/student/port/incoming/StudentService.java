package com.school.core.student.port.incoming;

import java.util.Optional;

import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.command.StudentListCommand;
import com.school.core.student.model.reply.StudentListReply;
import com.school.core.student.model.reply.StudentReply;

public interface StudentService {
	
	/**
	 * get student by student id
	 * 
	 * @param command
	 * @return reply
	 */
	Optional<StudentReply> handle(StudentGetCommand command);
	
	/**
	 * get student list by class id
	 * 
	 * @param command
	 * @return reply
	 */
	Optional<StudentListReply> handle(StudentListCommand command);
	
}
