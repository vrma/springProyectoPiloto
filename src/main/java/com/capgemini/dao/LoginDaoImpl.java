package com.capgemini.dao;

import java.util.List;

import org.hibernate.Criteria;

import com.capgemini.model.Login;
import com.capgemini.model.Propiedad;

public class LoginDaoImpl extends AbstractDao<Integer, Propiedad> implements LoginDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Login> getUsuarios() {
		Criteria criteria = createEntityCriteria();
		
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (List<Login>) criteria.list();
	}

}
