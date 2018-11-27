package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
	//Constantes
	
	//Attributs
	private String nom;
	private String prenom;
	private String matricule;
	private LocalDate dateEmbauche;
	private Double salaire;

	//Constructeurs
	
	public Employe() {
		
	}
	
	public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}

	//Méthodes fonctionnelles
	
	public final Integer getNombreAnneeAnciennete() {
		return LocalDate.now().getYear() - dateEmbauche.getYear();
	}
	
	public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
		if(dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())) {
			throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
		}
		this.dateEmbauche = dateEmbauche;
}

	public Integer getNbConges() {
		return Entreprise.NB_CONGES_BASE;
}

	//Getters/Setters
	
	
	public String getNom() {
		return nom; 
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom; 
	}
	
	public String getMatricule() {
		return matricule; 
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	//ToString - "Employe{nom='nom', prenom='prenom', matricule='12345', dateEmbauche=1970-01-01, salaire=500.0}"
	
	public String toString() {
		final StringBuilder sb = new StringBuilder("Employe{");
		sb.append("nom='").append(nom).append('\'');
		sb.append(", prenom='").append(prenom).append('\'');
		sb.append(", matricule='").append(matricule).append('\'');
		sb.append(", dateEmbauche=").append(dateEmbauche);
		sb.append(", salaire=").append(salaire);
		sb.append('}');
		return sb.toString();
}

	//Hashcode
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
	}

	//Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (dateEmbauche == null) {
			if (other.dateEmbauche != null)
				return false;
		} else if (!dateEmbauche.equals(other.dateEmbauche))
			return false;
		if (matricule == null) {
			if (other.matricule != null)
				return false;
		} else if (!matricule.equals(other.matricule))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (salaire == null) {
			if (other.salaire != null)
				return false;
		} else if (!salaire.equals(other.salaire))
			return false;
		return true;
	}
	
	
	
}



