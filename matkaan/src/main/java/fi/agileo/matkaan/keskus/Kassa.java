package fi.agileo.matkaan.keskus;

public class Kassa {
	private double pohjasumma;
	private double[] maksu;
	
	public Kassa() {
		super();
		this.pohjasumma = 0;
		this.maksu = new double[10];
	}
	
	public Kassa(double pohjasumma, double[] maksu) {
		super();
		this.pohjasumma = pohjasumma;
		this.maksu = maksu;
	}

	public double getPohjasumma() {
		return pohjasumma;
	}

	public void setPohjasumma(double pohjasumma) {
		this.pohjasumma = pohjasumma;
	}

	public double[] getMaksu() {
		return maksu;
	}

	public void setMaksu(double[] maksu) {
		this.maksu = maksu;
	}
}
