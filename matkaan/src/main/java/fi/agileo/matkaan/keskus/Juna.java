package fi.agileo.matkaan.keskus;

import java.util.ArrayList;
import java.util.List;

public class Juna extends Kulkuneuvo {
	private List<String> vaunu;
	
	public Juna() {
		super();
		vaunu = new ArrayList<>();
	}

	public List<String> getVaunu() {
		return vaunu;
	}

	public void setVaunu(List<String> vaunu) {
		this.vaunu = vaunu;
	}

}
