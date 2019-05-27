package com.gsitm.meeting.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsitm.meeting.notice.dto.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	private SqlSession session;
	
	// session.selectOne(namespace + id); ∑Œ ¿‚±‚
	private String namespace = "com.gsitm.meeting.mappers.noticeMapper";

	@Override
	public List<Notice> noticeList() {
		return session.selectList(namespace + ".noticeList");
	}
	
}
