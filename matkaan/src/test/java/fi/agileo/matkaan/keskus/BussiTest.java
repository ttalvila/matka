package fi.agileo.matkaan.keskus;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BussiTest extends TestCase {
	Bussi bussi;

	@Before
	public void setUp() throws Exception {
		bussi = new Bussi();
		bussi.setKyydissa(10);
		bussi.setMaxMatkustajia(20);
	}

	@After
	public void tearDown() throws Exception {
		bussi = null;
	}

	@Test
	public void testKyydissa() {
		
		assertEquals(10, bussi.getKyydissa());
	}

	@Test
	public void testMaxMatkustajia() {
		
		assertNotNull(bussi.getClass());
		assertEquals(20, bussi.getMaxMatkustajia());
		assertNotSame(19, bussi.getMaxMatkustajia());
	}

}
