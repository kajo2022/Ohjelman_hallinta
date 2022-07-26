package kajo.ohjelma.control.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="aalto_lpk")
public class AaltoLpk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long row_id;
	
	private int aalto;
	
	@ManyToOne
	@JoinColumn(name="alaleiri", referencedColumnName="alaleiri_nimi")
	private Alaleiri alaleiri; 
	
	@ManyToOne
	@JoinColumn(name="leiri_lpk", referencedColumnName="leirilpk_nro")
	private Leirilpk leirilpk;
	
	public AaltoLpk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public AaltoLpk(int aalto, Alaleiri alaleiri, Leirilpk leirilpk) {
		super();
		this.aalto = aalto;
		this.alaleiri = alaleiri;
		this.leirilpk = leirilpk;
	}



	public Long getRowId() {
		return row_id;
	}

	public int getAalto() {
		return aalto;
	}

	public void setAalto(int aalto) {
		this.aalto = aalto;
	}

	public Long getRow_id() {
		return row_id;
	}

	public Alaleiri getAlaleiri() {
		return alaleiri;
	}

	public void setAlaleiri(Alaleiri alaleiri) {
		this.alaleiri = alaleiri;
	}

	public Leirilpk getLeirilpk() {
		return leirilpk;
	}

	public void setLeirilpk(Leirilpk leirilpk) {
		this.leirilpk = leirilpk;
	}





	
	
	
	

}
