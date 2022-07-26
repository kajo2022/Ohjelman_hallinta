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
@Table(name= "osa_alue")
public class Osaalue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "osa_alue_nimi")
	//@OneToMany(mappedBy="osa_alue")
	private String osalue;
	
	

	public Osaalue(String osalue) {
		super();
		this.osalue = osalue;
	}
	public Osaalue() {
		super();
	}

	public String getOsalue() {
		return osalue;
	}

	public void setOsalue(String osalue) {
		this.osalue = osalue;
	}

}
