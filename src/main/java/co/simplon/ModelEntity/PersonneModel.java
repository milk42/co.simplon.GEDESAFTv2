package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PersonneModel implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=40)
	private String nom;
	@Column(length=40)
	private String prenom;
	
	@ManyToMany
	private List<VehiculeModel> listVehicule;
	@ManyToMany
	private List<ArmeModel> listArme;
	@ManyToMany
	private List<AgentAffecteModel> listPersonnel;
	@ManyToMany
	private List<SuspectModel> listSuspect;
	@ManyToMany
	private List<TemoinModel> listTemoin;
	@ManyToMany
	private List<VictimeModel> listVictime;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public List<VehiculeModel> getListVehicule() {
		return listVehicule;
	}
	public void setListVehicule(List<VehiculeModel> listVehicule) {
		this.listVehicule = listVehicule;
	}
	public List<ArmeModel> getListArme() {
		return listArme;
	}
	public void setListArme(List<ArmeModel> listArme) {
		this.listArme = listArme;
	}
	public List<AgentAffecteModel> getListPersonnel() {
		return listPersonnel;
	}
	public void setListPersonnel(List<AgentAffecteModel> listPersonnel) {
		this.listPersonnel = listPersonnel;
	}
	public List<SuspectModel> getListSuspect() {
		return listSuspect;
	}
	public void setListSuspect(List<SuspectModel> listSuspect) {
		this.listSuspect = listSuspect;
	}
	public List<TemoinModel> getListTemoin() {
		return listTemoin;
	}
	public void setListTemoin(List<TemoinModel> listTemoin) {
		this.listTemoin = listTemoin;
	}
	public List<VictimeModel> getListVictime() {
		return listVictime;
	}
	public void setListVictime(List<VictimeModel> listVictime) {
		this.listVictime = listVictime;
	}
	
	
	
}
