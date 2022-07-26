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
@Table(name="alaleiri")
public class Alaleiri {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="alaleiri_nimi")
	//@OneToMany(mappedBy="alaleiri")
	private String alaleiri;
	
	

	public Alaleiri(String alaleiri) {
		super();
		this.alaleiri = alaleiri;
	}

	public Alaleiri() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAlaleiri() {
		return alaleiri;
	}

	public void setAlaleiri(String alaleiri) {
		this.alaleiri = alaleiri;
	}
}
