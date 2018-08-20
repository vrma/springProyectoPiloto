package com.capgemini.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Login;
import com.capgemini.model.Propiedad;

@Repository("loginDao")
public class LoginDaoImpl extends AbstractDao<Integer, Login> implements LoginDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Login> getUsuarios() {
		Criteria criteria = createEntityCriteria();
		
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (List<Login>) criteria.list();
	}

}
