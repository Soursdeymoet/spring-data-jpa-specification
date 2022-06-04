package com.school.core.student.model.reply;

import java.util.List;

import com.school.share.model.Pagination;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentListReply {

	private List<StudentReply> data;
	private Pagination pagination;
}
