package fr.diginamic.region;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVille {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-region");
		EntityManager entity = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entity.getTransaction();
		
		transaction.begin();
		
		Region region = new Region();
		region.setNom("Auvergne-Rhône-Alpes");
		region.setDateCreation(new Date());
		entity.persist(region);
		
		Region region2 = new Region();
		region2.setNom("Bretagne");
		region2.setDateCreation(new Date());
		entity.persist(region2);
		
		Region region3 = new Region();
		region3.setNom("Pays de la Loire");
		region3.setDateCreation(new Date());
		entity.persist(region3);
		
		
		
		Ville ville = new Ville();
		ville.setNom("Nantes");
		ville.setCodePostal(44000);
		ville.setDateDernierRecens(new Date());
		ville.setCategorie(Categorie.MOYENNE);
		ville.setRegion(region3);
		entity.persist(ville);
		
		Ville ville2 = new Ville();
		ville2.setNom("Lyon");
		ville2.setCodePostal(69000);
		ville2.setDateDernierRecens(new Date());
		ville2.setCategorie(Categorie.GRANDE);
		ville2.setRegion(region);
		entity.persist(ville2);
		
		
		
		Habitant habitant = new Habitant();
		habitant.setNom("DuPont");
		habitant.setPrenom("Jean");
		entity.persist(habitant);
		
		Habitant habitant2 = new Habitant();
		habitant2.setNom("Christon");
		habitant2.setPrenom("Antoine");
		entity.persist(habitant2);
		
		Habitant habitant3 = new Habitant();
		habitant3.setNom("LeBec");
		habitant3.setPrenom("Marie");
		entity.persist(habitant3);
		
		ville.getHabitants().add(habitant);
		ville2.getHabitants().add(habitant2);
		ville2.getHabitants().add(habitant3);
		
		//Ville villeRecherche = entity.find(Ville.class, 1);
		//if (villeRecherche != null) {
		//	System.out.println(villeRecherche.getId()+" "+villeRecherche.getNom()+" "+villeRecherche.getCodePostal());
		//}
		
		
		transaction.commit();
	}

}
