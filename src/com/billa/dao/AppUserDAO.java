package com.billa.dao;

import com.billa.dao.dto.AppUserDTO;

public interface AppUserDAO {
	AppUserDTO selectAppUser(String username);

	int insertAppUser(AppUserDTO appuser);

	int updateAppUser(AppUserDTO appuser);

	int deleteAppUser(AppUserDTO appuser);

}
