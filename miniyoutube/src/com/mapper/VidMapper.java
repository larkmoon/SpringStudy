package com.mapper;

import java.sql.Date;
import java.util.List;

import com.vo.VidVO;

public interface VidMapper {
	public void insert(VidVO obj) throws Exception;
	public void delete(Integer k) throws Exception;
	public void update(VidVO obj) throws Exception;
	public VidVO select(Integer k) throws Exception;
	public List<VidVO> selectall() throws Exception;
	
	public List<VidVO> searchtitle(String title) throws Exception;
	public List<VidVO> searchviews(Double views) throws Exception;
	public List<VidVO> searchdate(Date regdate) throws Exception;
	
	public void increaseview(VidVO obj) throws Exception;
	public VidVO watch(Integer k) throws Exception;
}
