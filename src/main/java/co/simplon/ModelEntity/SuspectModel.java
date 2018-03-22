package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SuspectModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=40)
	private String pseudo;
	private String photo;
	private String signeParticulier;
	@Column(length=15)
	private String couleurPeau;
	@Column(length=15)
	private String couleurCheveux;
	@Column(length=10)
	private int taille;
	
	private List<AffaireModel> listAffaire;
	private List<PersonneModel> listPersonne;
	
	
	
	
	
	public List<AffaireModel> getListAffaire() {
		return listAffaire;
	}
	public void setListAffaire(List<AffaireModel> listAffaire) {
		this.listAffaire = listAffaire;
	}
	public List<PersonneModel> getListPersonne() {
		return listPersonne;
	}
	public void setListPersonne(List<PersonneModel> listPersonne) {
		this.listPersonne = listPersonne;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSigneParticulier() {
		return signeParticulier;
	}
	public void setSigneParticulier(String signeParticulier) {
		this.signeParticulier = signeParticulier;
	}
	public String getCouleurPeau() {
		return couleurPeau;
	}
	public void setCouleurPeau(String couleurPeau) {
		this.couleurPeau = couleurPeau;
	}
	public String getCouleurCheveux() {
		return couleurCheveux;
	}
	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
	
	

}
