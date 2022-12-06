package fr.diginamic.region;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="HABITANT")
public class Habitant {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "NOM", length = 50, nullable= false, unique= true)
	public String nom;
	
	@Column(name = "PRENOM", length = 50, nullable= false, unique= true)
	public String prenom;
	
	@ManyToMany(mappedBy ="habitants")
	public List<Ville> villes = new ArrayList<Ville>();
	
	public Habitant() {
		
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/**
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
}