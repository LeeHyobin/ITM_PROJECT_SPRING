package com.gsitm.meeting.branch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gsitm.meeting.branch.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
}
