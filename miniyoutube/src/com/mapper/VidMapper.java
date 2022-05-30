package com.mapper;

import java.util.List;

import com.vo.VidVO;

public interface VidMapper {
	public void insert(VidVO obj);
	public void delete(Integer k);
	public void update(VidVO obj);
	public VidVO select(Integer k);
	public List<VidVO> selectall();
}
