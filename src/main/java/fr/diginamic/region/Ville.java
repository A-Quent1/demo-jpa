package fr.diginamic.region;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VILLE")
public class Ville {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "NOM", length = 50, nullable= false, unique= true)
	public String nom;
	
	@Column(name = "CODE_POSTAL", nullable= false, unique= true)
	public int codePostal;
	
	@Column(name = "DATE_DERNIER_RECENSEMENT", nullable= false, unique= true)
	public Date dateDernierRecens;
	
	@Column(name = "CATEGORIE", nullable= false, unique= true)
	@Enumerated(EnumType.STRING)
	public Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name = "ID_REGION")
	public Region region;
	
	@ManyToMany
	@JoinTable(name = "LIEN_VILLE_HAB",
	joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_HAB", referencedColumnName = "Id" ))
	public List<Habitant> habitants = new ArrayList<Habitant>();
	
	/**
	 * 
	 */
	public Ville() {
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
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param i the codePostal to set
	 */
	public void setCodePostal(int i) {
		this.codePostal = i;
	}

	/**
	 * @return the dateDernierRecens
	 */
	public Date getDateDernierRecens() {
		return dateDernierRecens;
	}

	/**
	 * @param dateDernierRecens the dateDernierRecens to set
	 */
	public void setDateDernierRecens(Date dateDernierRecens) {
		this.dateDernierRecens = dateDernierRecens;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * @return the habitants
	 */
	public List<Habitant> getHabitants() {
		return habitants;
	}

	/**
	 * @param habitants the habitants to set
	 */
	public void setHabitants(List<Habitant> habitants) {
		this.habitants = habitants;
	}
	
}
