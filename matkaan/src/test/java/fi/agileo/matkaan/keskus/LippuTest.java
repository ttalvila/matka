package fi.agileo.matkaan.keskus;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LippuTest {
	Lippu lippu;

	@Before
	public void setUp() throws Exception {
		lippu = new Lippu();
		lippu.setLahtopiste("Jyväskylä");
		lippu.setPaatepiste("Helsinki");
		lippu.setHinta(49.90);
		lippu.setLahtoaika(new Date(2000000));
		lippu.setPerilletuloaika(new Date(2000050));
	}

	@After
	public void tearDown() throws Exception {
		lippu = null;
	}

	@Test
	public void testLippu() {
		assertEquals("Jyväskylä", lippu.getLahtopiste());
		assertEquals("Helsinki", lippu.getPaatepiste());
		assertEquals(49.90, lippu.getHinta(), 0);
		assertNotEquals(48.0, lippu.getHinta(), 0.5);
		assertEquals(new Date(2000000), lippu.getLahtoaika());
		assertEquals(new Date(2000050), lippu.getPerilletuloaika());
	}

}
