package com.school.application.share;

import com.school.share.model.Pagination;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaginationResponse<T> {

	private T data;
	private Pagination pagination;
}
