package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.util.SingletonEmf;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void persist(ProductEntity entity) {
		EntityManager entityManager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
	}

	@Override
	public void saveAll(List<ProductEntity> entities) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		int flushcount = 0;
		try {
			for (ProductEntity productEntity : entities) {
				manager.persist(productEntity);

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

	@Override
	public List<ProductEntity> getAll() {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<Integer> getBypriceGreaterThan(Integer price) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getBypriceGreaterThan");

			query.setParameter("setprice", price);

			return (List<Integer>) query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.clear();
			}
		}
		return null;
	}

	@Override
	public List<Integer> getBypriceLesserThan(Integer price) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getBypriceLesserThan");
			query.setParameter("setminprice", price);
			return (List<Integer>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.clear();
			}
		}
		return null;
	}

	@Override
	public ProductEntity getByNameAndId(String name, int id) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("i", id);
			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.clear();
			}
		}
		return null;
	}

	@Override
	public int getMaxPrice() {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getMaxPrice");

			return (int) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public int getTotalPrice() {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getTotalPrice");

			return (int) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public String getByNamelike(String name) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByNamelike");

			query.setParameter("setname", name);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public Object getQuantityByName(String name) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityByName");

			query.setParameter("setname", name);

			return query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByName(String name) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByName");

			query.setParameter("setname", name);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByNameAndId(String name, int id) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByNameAndId");

			query.setParameter("setname", name);
			query.setParameter("setid", id);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public List<Object[]> getNameAndPrice() {
		EntityManager manager=SingletonEmf.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getNameAndPrice");
						
			List<Object[]>	 result=query.getResultList();
					
			for (Object[] objects : result) {
				String name=(String) objects[0];
				float price=(float) objects[1];
				
				System.out.println(name);
				System.out.println(price);
				System.out.println("    ");
				
			}
			return result;
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if(manager!=null) {
				manager.close();
			}
		}
		return null;
		
		
	}

	@Override
	public String getBrand(String name) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByBrand");

			query.setParameter("set", name);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public Object[] getNameAndPriceByBrand(String brand) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getNameAndPriceByBrand");

			query.setParameter("setbrand", brand);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Name=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getByBrand(String brand) {
		EntityManager manager = SingletonEmf.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByBrand");

			query.setParameter("setbrand", brand);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}
}
