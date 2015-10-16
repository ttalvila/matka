package fi.agileo.matkaan.keskus;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class JunaTest {
	Juna juna;

	@Before
	public void setUp() throws Exception {
		juna = new Juna();
		List<String> vaunu = new ArrayList<>();
		vaunu.add("Veturi");
		vaunu.add("Vaunu1");
		vaunu.add("Vaunu2");
		vaunu.add("Vaunu3");
		juna.setKyydissa(50);
		juna.setMaxMatkustajia(200);
		juna.setVaunu(vaunu);
	}

	@After
	public void tearDown() throws Exception {
		juna.setVaunu(null);
	}

	@Test
	public void testVaunut() {
		List<String> v2 = new ArrayList<String>();
		v2.add("Veturi");
		v2.add("Vaunu1");
		v2.add("Vaunu2");
		v2.add("Vaunu3");
		assertNotNull(juna);
		assertArrayEquals(v2.toArray(), juna.getVaunu().toArray());
		assertNotSame(v2, juna.getVaunu());
	}

}
