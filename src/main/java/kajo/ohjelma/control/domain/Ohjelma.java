package kajo.ohjelma.control.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "main")
public class Ohjelma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ohjelma_id;
	
	private String otsikko;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime start;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime end;
	private String paikka;
	private Integer aalto;
	private String internal_desc;
	private Integer leiri_app;
	private String lisatieto;
	
	@ManyToOne
	@JoinColumn(name="kategoria", referencedColumnName="kategoria_nimi")
	private Kategoria kategoria; 
	
	@ManyToOne
	@JoinColumn(name="alaleiri", referencedColumnName="alaleiri_nimi")
	private Alaleiri alaleiri; 
	
	@ManyToOne
	@JoinColumn(name="ikakausi", referencedColumnName="ikakausi_nimi")
	private Ikakausi ikakausi;

	@ManyToOne
	@JoinColumn(name="osa_alue", referencedColumnName="osa_alue_nimi")
	private Osaalue osa_alue;
	
	@ManyToOne
	@JoinColumn(name="ryhma", referencedColumnName="ryhma_nimi")
	private Ryhma ryhma;
	
	
	

	public Ohjelma(String otsikko, LocalDateTime start, LocalDateTime end, String paikka, Integer aalto,
			String internal_desc, Integer leiri_app, String lisatieto, Kategoria kategoria, Alaleiri alaleiri,
			Ikakausi ikakausi, Osaalue osa_alue, Ryhma ryhma) {
		super();
		this.otsikko = otsikko;
		this.start = start;
		this.end = end;
		this.paikka = paikka;
		this.aalto = aalto;
		this.internal_desc = internal_desc;
		this.leiri_app = leiri_app;
		this.lisatieto = lisatieto;
		this.kategoria = kategoria;
		this.alaleiri = alaleiri;
		this.ikakausi = ikakausi;
		this.osa_alue = osa_alue;
		this.ryhma = ryhma;
	}
	
	public Ohjelma() {
		super();
	}

	public int getOhjelma_id() {
		return ohjelma_id;
	}

	public void setOhjelma_id(int ohjelma_id) {
		this.ohjelma_id = ohjelma_id;
	}

	public void setAalto(Integer aalto) {
		this.aalto = aalto;
	}

	public String getOtsikko() {
		return otsikko;
	}

	public void setOtsikko(String otsikko) {
		this.otsikko = otsikko;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public String getPaikka() {
		return paikka;
	}

	public void setPaikka(String paikka) {
		this.paikka = paikka;
	}

	public Integer getAalto() {
		return aalto;
	}

	public void setAalto(int aalto) {
		this.aalto = aalto;
	}

	public String getInternal_desc() {
		return internal_desc;
	}

	public void setInternal_desc(String internal_desc) {
		this.internal_desc = internal_desc;
	}

	public Integer getLeiri_app() {
		return leiri_app;
	}

	public void setLeiri_app(Integer leiri_app) {
		this.leiri_app = leiri_app;
	}

	public String getLisatieto() {
		return lisatieto;
	}

	public void setLisatieto(String lisatieto) {
		this.lisatieto = lisatieto;
	}

	public Kategoria getKategoria() {
		return kategoria;
	}

	public void setKategoria(Kategoria kategoria) {
		this.kategoria = kategoria;
	}

	public Alaleiri getAlaleiri() {
		return alaleiri;
	}

	public void setAlaleiri(Alaleiri alaleiri) {
		this.alaleiri = alaleiri;
	}

	public Ikakausi getIkakausi() {
		return ikakausi;
	}

	public void setIkakausi(Ikakausi ikakausi) {
		this.ikakausi = ikakausi;
	}

	public Osaalue getOsa_alue() {
		return osa_alue;
	}

	public void setOsa_alue(Osaalue osa_alue) {
		this.osa_alue = osa_alue;
	}

	public Ryhma getRyhma() {
		return ryhma;
	}

	public void setRyhma(Ryhma ryhma) {
		this.ryhma = ryhma;
	}

	
	
	
	
	
	

}
