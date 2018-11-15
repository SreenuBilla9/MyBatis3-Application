package com.billa.dao;

import com.billa.dao.dto.AppUserDTO;
import com.billa.dao.exception.DatabaseException;

public interface AppUserDAO {
	AppUserDTO selectAppUser(String username) throws DatabaseException;

	int insertAppUser(AppUserDTO appuser) throws DatabaseException;

	int updateAppUser(AppUserDTO appuser) throws DatabaseException;

	int deleteAppUser(AppUserDTO appuser) throws DatabaseException;

}
