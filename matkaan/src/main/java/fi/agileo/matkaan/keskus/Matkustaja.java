package fi.agileo.matkaan.keskus;

public class Matkustaja {
	private String nimi;

	public Matkustaja() {
		super();
		this.nimi = "";
	}

	public Matkustaja(String nimi) {
		super();
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		nimi = nimi;
	}
}
