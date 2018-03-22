package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AgentAffecteModel  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=40)
	private String grade;
	@Column
	private int droitAcces;
	@Column(length=7)
	private String identifiant;
	@Column(length=10)
	private String password;
	
	private List<AffaireModel> listAffaire;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getDroitAcces() {
		return droitAcces;
	}

	public void setDroitAcces(int droitAcces) {
		this.droitAcces = droitAcces;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AffaireModel> getListAffaire() {
		return listAffaire;
	}

	public void setListAffaire(List<AffaireModel> listAffaire) {
		this.listAffaire = listAffaire;
	}
	
	
}
