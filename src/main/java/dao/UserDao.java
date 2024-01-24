package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.RegisterUser;

public class UserDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Peeyush");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insertUser(RegisterUser registerUser) {
		entityTransaction.begin();
		entityManager.persist(registerUser);
		entityTransaction.commit();
		
		
		
	}
	
}
