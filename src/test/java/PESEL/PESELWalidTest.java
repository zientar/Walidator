package PESEL;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PESELWalidTest {
	PESELWalid pesel = PESELWalid.getInstancja();

	@Test
	public void jesliPeselJestPoprawnyZwrocPrawde() {
		assertTrue(pesel.walid(""));
	}

	@Test
	public void jesliPeselNieJestPoprawnyZwrosFalsz() {
		assertFalse(pesel.walid("11111111111"));
	}
}
