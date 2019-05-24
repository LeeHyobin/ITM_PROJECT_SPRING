package com.gsitm.meeting.branch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsitm.meeting.branch.dao.BranchDaoImpl;

@Service
public class BranchService {

	@Autowired
	private BranchDaoImpl brDao;
}
