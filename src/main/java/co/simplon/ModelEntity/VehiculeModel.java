package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class VehiculeModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column (length=40)
	private String type;
	@Column (length=40)
	private String marque;
	@Column (length=40)
	private String modele;
	@Column (length=40)
	private String immatriculation;
	@Column (length=40)
	private String couleur;
	
	@ManyToMany
	private List<AffaireModel> listAffaire;
	@ManyToMany
	private List<PersonneModel> listPersonne;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PersonneModel> getListPersonne() {
		return listPersonne;
	}

	public void setListPersonne(List<PersonneModel> listPersonne) {
		this.listPersonne = listPersonne;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public List<AffaireModel> getListAffaire() {
		return listAffaire;
	}

	public void setListAffaire(List<AffaireModel> listAffaire) {
		this.listAffaire = listAffaire;
	}
	
	
	


}
