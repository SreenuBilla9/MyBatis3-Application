package com.billa.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.billa.dao.AppUserDAO;
import com.billa.dao.dto.AppUserDTO;
import com.billa.dao.util.MyBatisUtil;

public class AppUserDAOMyBatis implements AppUserDAO {

	@Override
	public AppUserDTO selectAppUser(String username) {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AppUserDAO mapper = session.getMapper(AppUserDAO.class);
			return mapper.selectAppUser(username);
		} finally {
			if (null != session)
				session.close();
		}
	}

	@Override
	public int insertAppUser(AppUserDTO appuser) {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AppUserDAO mapper = session.getMapper(AppUserDAO.class);
			int count = mapper.insertAppUser(appuser);
			session.commit();
			return count;
		} finally {
			if (null != session)
				session.close();
		}

	}

	@Override
	public int updateAppUser(AppUserDTO appuser) {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AppUserDAO mapper = session.getMapper(AppUserDAO.class);
			int count = mapper.updateAppUser(appuser);
			session.commit();
			return count;
		} finally {
			if (null != session)
				session.close();
		}
	}

	@Override
	public int deleteAppUser(AppUserDTO appuser) {

		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AppUserDAO mapper = session.getMapper(AppUserDAO.class);
			int count = mapper.deleteAppUser(appuser);
			session.commit();
			return count;
		} finally {
			if (null != session)
				session.close();
		}
	}

}
