package com.billa.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.billa.dao.AccountDaoMapper;
import com.billa.dao.dto.AccountDTO;
import com.billa.dao.util.MyBatisUtil;

public class AccountDaoMapperImpl implements AccountDaoMapper {

	@Override
	public int insertAccount(AccountDTO accountDTO) {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AccountDaoMapper mapper = session.getMapper(AccountDaoMapper.class);
			int count = mapper.insertAccount(accountDTO);
			session.commit();
			return count;
		} finally {
			if (null != session)
				session.close();
		}

	}

	@Override
	public int batchInsert(List<AccountDTO> list) {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AccountDaoMapper mapper = session.getMapper(AccountDaoMapper.class);
			int totalCount = 0;
			for (AccountDTO ddto : list) {
				int count = mapper.insertAccount(ddto);
				System.out.println("count=" + count);
				totalCount = totalCount + count;
			}
			session.commit();
			return totalCount;
		} finally {
			if (null != session)
				session.close();
		}

	}

}
