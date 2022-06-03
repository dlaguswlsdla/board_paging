package com.jafa.config;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.mapper.TestMapper;

public class RootConfigTest extends AppTest{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void test() {
		assertNotNull(dataSource);
	}

	@Test
	public void mapperTest() {
		System.out.println(testMapper.myTime());
	}
}
