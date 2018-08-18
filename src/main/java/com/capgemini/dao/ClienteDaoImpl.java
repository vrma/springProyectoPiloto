package com.capgemini.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Cliente;

@Repository("clienteDao")
public class ClienteDaoImpl extends AbstractDao<Integer, Cliente> implements ClienteDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getClientes() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (List<Cliente>) criteria.list();
	}

	@Override
	public Cliente getClienteById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Cliente getClienteByDni(String dni) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("dni", dni));
		return (Cliente) criteria.uniqueResult();
	}

	@Override
	public void saveCliente(Cliente cliente) {
		persist(cliente);
	}

	@Override
	public void deleteClienteByDni(String dni) {
		Query query = getSession().createSQLQuery("DELETE FROM clientes WHERE dni = :dni");
		query.setString("dni", dni);
		query.executeUpdate();
	}

}
