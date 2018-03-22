package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TemoinModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String temoignage;
	
	@ManyToMany
	private List<AffaireModel> listAffaire;
	@ManyToMany
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
	public String getTemoignage() {
		return temoignage;
	}
	public void setTemoignage(String temoignage) {
		this.temoignage = temoignage;
	}
	

	
}
