package fr.diginamic.emprunt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-emprunt");
		EntityManager entity = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entity.getTransaction();

		transaction.begin();

		//Livre livre = new Livre();
		//livre.setId(6);
		//livre.setTitre("");
		//livre.setAuteur("");
		//entity.persist(livre);
		
		//Livre livreRecherche = entity.find(Livre.class, 6);
		//if (livreRecherche != null) {
		//	livreRecherche.setTitre("Jurassic Park");
		//	livreRecherche.setAuteur("Michael Crichton");
		//}
		
		
		
		Emprunt empruntRecherche = entity.find(Emprunt.class, 3);
		if (empruntRecherche != null) {
			System.out.println("L'emprunt avec l'id : "+empruntRecherche.getId()+" fait à la date du "+empruntRecherche.getDateDebut()+
					" c'est terminé le "+empruntRecherche.getDateFin()+" pour un délai total de "+empruntRecherche.getDelai()+" jours");
			System.out.println("Les livres empruntés par ce client sont : ");
			 for(int i = 0; i < empruntRecherche.getLivres().size() ; i++)
		       {
				 
		       	 System.out.println (empruntRecherche.getLivres());
		       }
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		Client clientRecherche = entity.find(Client.class, 2);
		if (clientRecherche != null) {
			System.out.println("Le client avec l'id "+clientRecherche.getId()+" s'appelle "+clientRecherche.getPrenom()+
					" "+clientRecherche.getNom());
			System.out.println("Les emprunts effectués par ce client sont : ");
			 for(int i = 0; i < clientRecherche.getEmprunts().size() ; i++)
		       {
				 
		       	 System.out.println (clientRecherche.getEmprunts());
		       }
		}
		
		transaction.commit();
	}

}
