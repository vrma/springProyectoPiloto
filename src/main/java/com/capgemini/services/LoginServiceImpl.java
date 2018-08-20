package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.LoginDao;
import com.capgemini.model.Login;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public List<Login> getUsuarios() {
		// TODO Auto-generated method stub
		return loginDao.getUsuarios();
	}

}
