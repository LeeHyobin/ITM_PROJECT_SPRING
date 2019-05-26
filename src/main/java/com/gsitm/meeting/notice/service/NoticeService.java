package com.gsitm.meeting.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsitm.meeting.notice.dao.NoticeDaoImpl;
import com.gsitm.meeting.notice.dto.Notice;

@Service
public class NoticeService {

	@Autowired
	private NoticeDaoImpl noticeDao;
	
	public List<Notice> noticeList(){
		System.out.println(noticeDao.noticeList());
		return noticeDao.noticeList();
	}
}
