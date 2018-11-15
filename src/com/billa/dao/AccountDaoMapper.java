package com.billa.dao;

import java.util.List;

import com.billa.dao.dto.AccountDTO;

public interface AccountDaoMapper {

	int insertAccount(AccountDTO accountDTO);

	int batchInsert(List<AccountDTO> list);
}
