package com.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.VidMapper;
import com.vo.VidVO;

@org.springframework.stereotype.Service("vservice")
public class VidService implements Service<Integer, VidVO>{
	
	@Autowired
	VidMapper dao;

	@Override
	public void register(VidVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(VidVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public VidVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<VidVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<VidVO> searchtitle(String title) throws Exception{
		return dao.searchtitle(title);
	}
	
	public List<VidVO> searchviews(Double views) throws Exception{
		return dao.searchviews(views);
	}
	
	public List<VidVO> searchdate(Date regdate) throws Exception{
		return dao.searchdate(regdate);
	}

	public void increaseview(VidVO v) throws Exception{
		dao.increaseview(v);
	}

	public VidVO watch(Integer k) throws Exception{
		VidVO v = dao.select(k);
		VidVO v2 = new VidVO(k, v.getViews() + 1);
		dao.increaseview(v2);
		return dao.select(k);
	}
	

}
