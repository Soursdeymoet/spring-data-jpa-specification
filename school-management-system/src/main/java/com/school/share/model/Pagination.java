package com.school.share.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Pagination {

	private Integer page;
	private Integer size;
	private Integer elements;
	private Integer total;
}
