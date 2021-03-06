package com.capgemini.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository; 


import com.capgemini.model.Propiedad;

@Repository("propiedadDao")
public class PropiedadDaoImpl extends AbstractDao<Integer, Propiedad> implements PropiedadDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Propiedad> getPropiedades() {
			Criteria criteria = createEntityCriteria();
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			return (List<Propiedad>) criteria.list();
		 
	}

	@Override
	public Propiedad getPropiedadById(Integer id) {
		return getByKey(id);
	}
	
	@Override
	public Propiedad getPropiedadByDireccion(String direccion) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eqOrIsNull("direccion", direccion));
		return (Propiedad) criteria.uniqueResult();
	}
	

}
