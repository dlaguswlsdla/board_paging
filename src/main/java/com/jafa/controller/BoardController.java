package com.jafa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jafa.mapper.BoardMapper;
import com.jafa.model.Criteria;
import com.jafa.model.PageMaker;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	BoardMapper mapper;
	
	@GetMapping("/list")
	public String getList(Criteria criteria, Model model) {
		PageMaker pageMaker = new PageMaker(criteria, mapper.totalCount());
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("list", mapper.getList(criteria));
		return "board/list";
		
	}
}
