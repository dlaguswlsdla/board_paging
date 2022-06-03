package com.jafa.model;

import lombok.Getter;

@Getter
public class PageMaker {
	
	private Criteria criteria;
	
	private int endPage;
	private int startPage;
	private int displayPageNum = 10;
	private int totalCount;
	
	private boolean prev;
	private boolean next;
	
	public PageMaker(Criteria criteria, int totalCount) {
		this.criteria = criteria;
		
		endPage = (int)Math.ceil(criteria.getPage()/(double)displayPageNum)*displayPageNum;
		startPage = endPage - displayPageNum + 1;
		int tempEndPage = (int)Math.ceil((double)totalCount / criteria.getPerPageNum());
		if(endPage > tempEndPage) endPage = tempEndPage;
		
		prev = startPage != 1;
		next = endPage < tempEndPage;
	}
	

}
