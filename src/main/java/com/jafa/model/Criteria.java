package com.jafa.model;

import lombok.Getter;
import lombok.Setter;

public class Criteria {
	
	@Setter 
	@Getter
	private int page;
	
	@Getter
	private int perPageNum;
	
	public Criteria() {
		this.page=1;
		this.perPageNum=10;
	}
	
	public int getStartPage() {
		return (this.page-1)*perPageNum;
	}
	
}
