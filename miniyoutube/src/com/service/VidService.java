package com.service;

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
	public void register(VidVO v) {
		dao.insert(v);
		
	}


	@Override
	public void modify(VidVO v) {
		dao.update(v);
		
	}


	@Override
	public List<VidVO> get() {
		return dao.selectall();
	}



	@Override
	public void remove(Integer k) {
		dao.delete(k);
	}


	@Override
	public VidVO get(Integer k) {
		return dao.select(k);
	}


}
