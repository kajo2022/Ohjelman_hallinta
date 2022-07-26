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
@Table(name="kategoria")
public class Kategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="kategoria_nimi")
	private String kategoria;

	public Kategoria(String kategoria) {
		super();
		this.kategoria = kategoria;
	}
	
	public Kategoria() {
		super();
	}

	public String getKategoria() {
		return kategoria;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}
}
