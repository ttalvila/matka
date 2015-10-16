package fi.agileo.matkaan.keskus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aikataulu {
	private String lahtopiste;
	private String paatepiste; 
	private List<String> reitti;
	private Date lahtoaika;
	private Date perilletuloaika;
	
	
	public Aikataulu() {
		super();
		this.lahtopiste = "";
		this.paatepiste = "";
		this.reitti = new ArrayList<String>();
		this.lahtoaika = new Date();
		this.perilletuloaika = new Date();
	}
	
	public Aikataulu(String lahtopiste, String paatepiste, List<String> reitti, Date lahtoaika, Date perilletuloaika) {
		super();
		this.lahtopiste = lahtopiste;
		this.paatepiste = paatepiste;
		this.reitti = reitti;
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
	public List<String> getReitti() {
		return reitti;
	}
	public void setReitti(List<String> reitti) {
		this.reitti = reitti;
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
