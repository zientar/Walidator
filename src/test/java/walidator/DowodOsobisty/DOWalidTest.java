package walidator.DowodOsobisty;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DOWalidTest {
	DOWalid dokument = new DOWalid();

	@Test
	public void jesliDokumentJestNiePrawidlowyZwrocFalsz() {
		assertFalse(dokument.walid(""));
	}

	@Test
	public void jesliDokumentJestPrawidlowyZwrocPrawde() {
		assertTrue(dokument.walid(""));
	}
}
