package PESEL;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PESELDataUrodzeniaTest {
	PESELDataUrodzenia data = PESELDataUrodzenia.getInstancja();

	@Test
	public void porownajDate() {
		LocalDate dzis = LocalDate.of();

		assertEquals(dzis, data.getData(""));
	}
}
