package com.school.core.student.port.incoming;

import java.util.Optional;

import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.reply.StudentReply;

public interface StudentService {
	
	Optional<StudentReply> handle(StudentGetCommand command);
	
}
