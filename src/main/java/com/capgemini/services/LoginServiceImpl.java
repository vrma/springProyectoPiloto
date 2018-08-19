package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dao.LoginDao;
import com.capgemini.model.Login;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao ldao;

	@Override
	public List<Login> getUsuarios() {
		// TODO Auto-generated method stub
		return ldao.getUsuarios();
	}

}
