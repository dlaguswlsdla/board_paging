package com.jafa.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
	
	@Select("select now()")
	Date myTime();

}
