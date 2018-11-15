package com.billa.dao;

import com.billa.dao.dto.TransactionDTO;
import com.billa.dao.exception.DatabaseException;

public interface TransactionDaoMapper {
	int insertTrans(TransactionDTO transDTO) throws DatabaseException;

}
