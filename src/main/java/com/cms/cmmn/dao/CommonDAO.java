package com.cms.cmmn.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.cms.sys.menu.vo.MenuVO;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("CommonDAO")
public class CommonDAO extends EgovAbstractMapper{
	public <E> List<E> selectList(String queryId) {
		return super.getSqlSession().selectList(queryId);
	}
	public <E> List<E> selectList(String queryId,MenuVO vo) {
		return super.getSqlSession().selectList(queryId,vo);
	}
	public <E> List<E> selectList(String queryId,MenuVO vo,RowBounds rowBounds) {
		return super.getSqlSession().selectList(queryId,vo);
	}
}
