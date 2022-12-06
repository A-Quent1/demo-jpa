package fr.diginamic.region;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="REGION")
public class Region {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "NOM", length = 50, nullable= false, unique= true)
	public String nom;
	
	@Column(name = "DATE_CREATION", nullable= false, unique= true)
	public Date dateCreation;
	
	@OneToMany(mappedBy ="region")
	public List<Ville> villes = new ArrayList<Ville>();
	
	public Region() {
		
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
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
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
