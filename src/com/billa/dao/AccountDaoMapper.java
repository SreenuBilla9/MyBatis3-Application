package com.billa.dao;

import java.util.List;

import com.billa.dao.dto.AccountDTO;
import com.billa.dao.exception.DatabaseException;

public interface AccountDaoMapper {

	int insertAccount(AccountDTO accountDTO) throws DatabaseException;

	int batchInsert(List<AccountDTO> list) throws DatabaseException;
}
