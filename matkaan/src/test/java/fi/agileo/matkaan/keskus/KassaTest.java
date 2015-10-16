package fi.agileo.matkaan.keskus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KassaTest {
	Kassa kassa;

	@Before
	public void setUp() throws Exception {
		kassa = new Kassa();
		kassa.setPohjasumma(100);
		double[] maksut = {12.30, 29.20, 30, 11.90};
		kassa.setMaksu(maksut);
	}

	@After
	public void tearDown() throws Exception {
		kassa = null;
	}

	@Test
	public void testPohjasumma() {
		assertEquals(100, kassa.getPohjasumma(), 0);
	}

	@Test
	public void testMaksut() {
		double[] maksut = {12.30, 29.20, 30.2, 11.90};
		assertArrayEquals(maksut, kassa.getMaksu(), 0.3);
	}

}
