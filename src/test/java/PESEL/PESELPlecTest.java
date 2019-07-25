package PESEL;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PESELPlecTest {
	PESELPlec plec = PESELPlec.getInstancja();

	@Test
	public void jesliPeselJestBlednyZwrocBlad() {
		assertEquals("PESEL nieprawid³owy", plec.ustalPlec("111111111111"));
	}

	@Test
	public void jesliPeselOkreslaKobieteZwrockobieta() {
		assertEquals("Kobieta", plec.ustalPlec(""));
	}

	@Test
	public void jesliPeselOkreslaMezczyzneZwrocMezczyzna() {
		assertEquals("Mê¿czyzna", plec.ustalPlec(""));
	}
}
