package fr.maBanque.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codecli;
	private String nomCli;
	@OneToMany(mappedBy="client", fetch=FetchType.LAZY)
	private Collection<Compte> comptes;
	public Client(Long codecli, String nomCli, Collection<Compte> comptes) {
		super();
		this.codecli = codecli;
		this.nomCli = nomCli;
		this.comptes = comptes;
	}
	@Override
	public String toString() {
		return "Client [codecli=" + codecli + ", nomCli=" + nomCli + ", comptes=" + comptes + "]";
	}
	public Client() {
		super();
	}
	public Long getCodecli() {
		return codecli;
	}
	public void setCodecli(Long codecli) {
		this.codecli = codecli;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
