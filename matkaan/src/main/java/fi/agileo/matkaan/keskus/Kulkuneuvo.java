package fi.agileo.matkaan.keskus;

public abstract class Kulkuneuvo {
	int maxMatkustajia;
	int kyydissa;

	public int getMaxMatkustajia() {
		return maxMatkustajia;
	}
	public void setMaxMatkustajia(int maxMatkustajia) {
		this.maxMatkustajia = maxMatkustajia;
	}
	public int getKyydissa() {
		return kyydissa;
	}
	public void setKyydissa(int kyydissa) {
		this.kyydissa = kyydissa;
	}
}
