package com.school.core.student.port;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.school.core.student.mapper.StudentCoreMapper;
import com.school.core.student.model.command.StudentGetCommand;
import com.school.core.student.model.reply.StudentReply;
import com.school.core.student.port.incoming.StudentService;
import com.school.core.student.port.outgoing.StudentProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentFacade implements StudentService {
	
	private final StudentProvider provider;
	private final StudentCoreMapper mapper;

	/**
	 * get student
	 * 
	 * @param command
	 * @return reply
	 */
	@Override
	public Optional<StudentReply> handle(StudentGetCommand command) {
		// TODO Auto-generated method stub
		return Optional.of(command)
				.map(mapper::from)
				.flatMap(provider::handle)
				.map(mapper::from);
	}

}
