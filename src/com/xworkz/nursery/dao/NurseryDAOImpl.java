package com.xworkz.nursery.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import com.xworkz.nursery.entity.NurseryEntity;
import com.xworkz.util.SingletonEmf;
public class NurseryDAOImpl implements NurseryDAO{
	@Override
	public void saveAll(List<NurseryEntity> entities) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		int flushcount = 0;
		try {
			for (NurseryEntity nurseryEntity : entities) {
				manager.persist(nurseryEntity);

				if (flushcount == 5) {
					manager.flush();
					flushcount = 0;
					manager.clear();
				}
				flushcount++;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		transaction.commit();
	}
}


