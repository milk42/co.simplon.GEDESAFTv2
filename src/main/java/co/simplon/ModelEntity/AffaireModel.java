package co.simplon.ModelEntity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AffaireModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=40)
	private String nom;
	@DateTimeFormat
	private Date date_creation;
	@DateTimeFormat
	private Date date_cloture;
	@Column(length=40)
	private String lieu;
	@Column(length=40)
	private String rapport;

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
	//private List<AdnModel> listAdn;
	//private List<EmpreinteModel> listEmpreinte;
	
	
	
	
	public String getNom() {
		return nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Date getDate_cloture() {
		return date_cloture;
	}
	public void setDate_cloture(Date date_cloture) {
		this.date_cloture = date_cloture;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getRapport() {
		return rapport;
	}
	public void setRapport(String rapport) {
		this.rapport = rapport;
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
