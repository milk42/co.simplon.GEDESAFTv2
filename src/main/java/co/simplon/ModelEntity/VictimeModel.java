package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class VictimeModel implements Serializable{
	
	
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length=40)
	private String typeAgression;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeAgression() {
		return typeAgression;
	}
	public void setTypeAgression(String typeAgression) {
		this.typeAgression = typeAgression;
	}
	
	

}
