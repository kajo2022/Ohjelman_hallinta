package kajo.ohjelma.control.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ryhma")
public class Ryhma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ryhma_nimi")
	//@OneToMany(mappedBy="ryhma")
	private String ryhma;
	
	

	public Ryhma(String ryhma) {
		super();
		this.ryhma = ryhma;
	}
	public Ryhma() {
		super();
	}

	public String getRyhma() {
		return ryhma;
	}

	public void setRyhma(String ryhma) {
		this.ryhma = ryhma;
	}

}
