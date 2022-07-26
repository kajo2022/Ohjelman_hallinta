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
@Table(name = "ikakausi")
public class Ikakausi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ikakausi_nimi")
	//@OneToMany(mappedBy="ikakausi")
	private String ikakausi;
	
	
	

	public Ikakausi(String ikakausi) {
		super();
		this.ikakausi = ikakausi;
	}

	public Ikakausi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIkakausi() {
		return ikakausi;
	}

	public void setIkakausi(String ikakausi) {
		this.ikakausi = ikakausi;
	}
	
	

}
