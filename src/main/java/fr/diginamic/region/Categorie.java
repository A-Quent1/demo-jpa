package fr.diginamic.region;

public enum Categorie {
	
	PETITE ("Petite"),
	MOYENNE ("Moyenne"),
	GRANDE ("Grande");
	
	public String libelle;
	
	Categorie(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
