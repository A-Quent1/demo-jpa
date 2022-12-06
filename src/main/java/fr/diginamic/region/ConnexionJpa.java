package fr.diginamic.region;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ConnexionJpa {
	
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-region");
	EntityManager entity = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entity.getTransaction();
	
	transaction.begin();
	
	Region region = new Region();
	region.setNom("Occitanie");
	entity.persist(region);
	
	Region region2 = new Region();
	region2.setNom("Bretagne");
	entity.persist(region2);	
	
	//Region regionRecherche = entity.find(Region.class, 1);
	//if (regionRecherche != null) {
	//	System.out.println(regionRecherche.getId()+" "+regionRecherche.getNom());
	//}
	
	transaction.commit();
	}
}
