package fr.diginamic.emprunt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIVRE")
public class Livre {
	
	@Id
	public int id;
	
	@Column(name = "TITRE", length = 255, nullable= false, unique= true)
	public String titre;
	
	@Column(name = "AUTEUR", length = 50, nullable= false, unique= true)
	public String auteur;
	
	@ManyToMany(mappedBy = "livre")
	public List<Emprunt> emprunts = new ArrayList<Emprunt>();

	/**
	 * 
	 */
	public Livre() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/**
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	public String toString() {
		
		return "Le livre "+titre+" écrit par "+auteur;
	}
	
}
