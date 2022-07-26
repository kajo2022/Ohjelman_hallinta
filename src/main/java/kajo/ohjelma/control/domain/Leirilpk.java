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
@Table(name = "leirilpk")
public class Leirilpk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leirilpk_nro")
	private int leirilpk;
	
	
	

	public Leirilpk(int leirilpk) {
		super();
		this.leirilpk = leirilpk;
	}

	public Leirilpk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLeirilpk() {
		return leirilpk;
	}

	public void setLeirilpk(int leirilpk) {
		this.leirilpk = leirilpk;
	}
	
}
