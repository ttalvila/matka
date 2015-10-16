package fi.agileo.matkaan.keskus;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AikatauluTest {
	Aikataulu aikataulu;
	@Before
	public void setUp() throws Exception {
		List<String> reitti = new ArrayList<>();
		reitti.add("Jyväskylä");
		reitti.add("Joutsa");
		reitti.add("Lahti");
		reitti.add("Helsinki");
		
		aikataulu = new Aikataulu("Jyväskylä", "Helsinki", reitti, new Date(200000), new Date(2000050));
	}

	@After
	public void tearDown() throws Exception {
		aikataulu.setReitti(null);
	}

	@Test
	public void testLahtopiste() {
		assertEquals("Jyväskylä", aikataulu.getLahtopiste());
		assertEquals(new Date(200000), aikataulu.getLahtoaika());
	}

	@Test
	public void testPaatepiste() {
		assertEquals("Helsinki", aikataulu.getPaatepiste());
		assertEquals(new Date(2000050), aikataulu.getPerilletuloaika());
	}
	@Test
	public void testReitti() {
		List<String> reitti = new ArrayList<>();
		reitti.add("Jyväskylä");
		reitti.add("Joutsa");
		reitti.add("Lahti");
		reitti.add("Helsinki");
		
		assertNotNull(aikataulu.getReitti());
		assertArrayEquals(reitti.toArray(), aikataulu.getReitti().toArray());
	}



}
