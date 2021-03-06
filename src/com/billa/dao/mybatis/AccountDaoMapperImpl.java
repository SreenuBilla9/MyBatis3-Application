package com.billa.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.billa.dao.AccountDaoMapper;
import com.billa.dao.dto.AccountDTO;
import com.billa.dao.exception.DatabaseException;
import com.billa.dao.util.MyBatisUtil;

public class AccountDaoMapperImpl implements AccountDaoMapper {

	@Override
	public int insertAccount(AccountDTO accountDTO) throws DatabaseException {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AccountDaoMapper mapper = session.getMapper(AccountDaoMapper.class);
			int count = mapper.insertAccount(accountDTO);
			session.commit();
			return count;
		} catch (Exception e) {
			throw e;
		} finally {
			if (null != session)
				session.close();
		}

	}

	@Override
	public int batchInsert(List<AccountDTO> list) throws DatabaseException {
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try {
			factory = MyBatisUtil.getSqlSessionFactory();
			session = factory.openSession();
			AccountDaoMapper mapper = session.getMapper(AccountDaoMapper.class);
			int totalCount = 0;
			for (AccountDTO ddto : list) {
				long seqNo = mapper.getSeqNum();
				ddto.setAccountId(seqNo);
			}
			totalCount = mapper.batchInsert(list);
			session.commit();
			return totalCount;
		} catch (Exception e) {
			throw e;
		} finally {
			if (null != session)
				session.close();
		}

	}

	@Override
	public long getSeqNum() throws DatabaseException {
		// TODO Auto-generated method stub
		return 0;
	}

}
