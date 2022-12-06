package fr.diginamic.emprunt;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@Id
	public int id;
	
	@Column(name = "DATE_DEBUT", nullable= false, unique= true)
	public Date dateDebut;
	
	@Column(name = "DATE_FIN", nullable= true, unique= true)
	public Date dateFin;
	
	@Column(name = "DELAI", length = 10, nullable= true, unique= true)
	public int delai;
	
	@ManyToMany
	@JoinTable(name = "COMPO",
	joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "Id"),
	inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "Id" ))
	public List<Livre> livres = new ArrayList<Livre>();
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	public Client client;

	/**
	 * 
	 */
	public Emprunt() {
		super();
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
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String toString() {
		
		return "L'emprunt "+id+" a commencé le "+dateDebut+" et c'est terminé le "+dateFin+
				" pour un délai total de "+delai+" jours";
	}
}
