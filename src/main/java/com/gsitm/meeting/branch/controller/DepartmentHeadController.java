package com.gsitm.meeting.branch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gsitm.meeting.branch.service.DepartmentHeadService;

@Controller
public class DepartmentHeadController {
	
	@Autowired
	private DepartmentHeadService deptHeadService;
}
