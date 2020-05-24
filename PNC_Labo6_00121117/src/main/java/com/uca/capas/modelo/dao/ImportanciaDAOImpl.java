package com.uca.capas.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.uca.capas.modelo.domain.Importancia;

@Repository
public class ImportanciaDAOImpl implements ImportanciaDAO {
	
	@PersistenceContext(unitName = "modelo-persistence")
	EntityManager entityManager;

	@Override
	public List<Importancia> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.importancia");
		Query query = entityManager.createNativeQuery(sb.toString(), Importancia.class);
		List<Importancia> res = query.getResultList();
		return res;
	}

	@Override
	public Importancia findOne(Integer c_importancia) throws DataAccessException {
		Importancia imp = entityManager.find(Importancia.class, c_importancia);
		return imp;
	}
}
