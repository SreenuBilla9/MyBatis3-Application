package com.test.dao.account;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.billa.dao.dto.AccountDTO;
import com.billa.dao.mybatis.AccountDaoMapperImpl;

public class TestAccountMapper {

	@Test
	public void insertAccount() {
		List<AccountDTO> list = new ArrayList<AccountDTO>();

		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setUsername("Test1234");
		accountDTO.setAccounttype("SBA");
		list.add(accountDTO);

		accountDTO = new AccountDTO();
		accountDTO.setUsername("Test1234");
		accountDTO.setAccounttype("SBB");
		list.add(accountDTO);

		AccountDaoMapperImpl dao = new AccountDaoMapperImpl();
		System.out.println("AccountDaoMapperImpl insertAccount start");

		try {
			int rows = dao.batchInsert(list);
			System.out.println("total row count=" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		System.out.println("AccountDaoMapperImpl insertAccount end");

	}

}
