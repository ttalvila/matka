package fi.agileo.matkaan.keskus;

import java.util.Date;
import java.util.List;

public class Lippu {
	private String lahtopiste;
	private String paatepiste; 
	private double hinta;
	private Date lahtoaika;
	private Date perilletuloaika;
	
	public Lippu() {
		super();
		this.lahtopiste = "";
		this.paatepiste = "";
		this.hinta = 0.0;
		this.lahtoaika = new Date();
		this.perilletuloaika = new Date();
	}

	public Lippu(String lahtopiste, String paatepiste, double hinta, Date lahtoaika, Date perilletuloaika) {
		super();
		this.lahtopiste = lahtopiste;
		this.paatepiste = paatepiste;
		this.hinta = hinta;
		this.lahtoaika = lahtoaika;
		this.perilletuloaika = perilletuloaika;
	}

	public String getLahtopiste() {
		return lahtopiste;
	}

	public void setLahtopiste(String lahtopiste) {
		this.lahtopiste = lahtopiste;
	}

	public String getPaatepiste() {
		return paatepiste;
	}

	public void setPaatepiste(String paatepiste) {
		this.paatepiste = paatepiste;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public Date getLahtoaika() {
		return lahtoaika;
	}

	public void setLahtoaika(Date lahtoaika) {
		this.lahtoaika = lahtoaika;
	}

	public Date getPerilletuloaika() {
		return perilletuloaika;
	}

	public void setPerilletuloaika(Date perilletuloaika) {
		this.perilletuloaika = perilletuloaika;
	}
	
}
