package com.gsitm.meeting.branch.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	
	@Autowired
	private SqlSession session;
	
	private String namespace = "com.gsitm.meeting.mappers.departmentMapper";

}
