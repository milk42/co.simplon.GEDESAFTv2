package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ArmeModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column (length=40)
	private String modele;
	@Column (length=40)
	private String type;

	private List<AffaireModel> listAffaire;
	private List<PersonneModel> listPersonne;
	//private List<AdnModel> listAdnArme;
	//private List<EmpreinteModel> listEmpreinteModel;

	
	
	public String getModele() {
		return modele;
	}

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

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AffaireModel> getListAffaire() {
		return listAffaire;
	}

	public void setListAffaire(List<AffaireModel> listAffaire) {
		this.listAffaire = listAffaire;
	}
	
	
	
}
