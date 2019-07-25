package PESEL;

public class PESELPlec {
	private static PESELPlec instancja;

	public static PESELPlec getInstancja() {
		if (instancja == null) {
			instancja = new PESELPlec();
		}
		return instancja;
	}

	private PESELPlec() {

	}

	private String plec(double liczba) {
		if (liczba % 2 == 0) {
			return "Kobieta";
		}
		return "Mê¿czyzna";
	}

	private int ustalLiczbe(String pesel) {
		return Integer.parseInt(pesel.substring(7, 10));
	}

	public String ustalPlec(String pesel) {
		if(!PESELWalid.getInstancja().walid(pesel)) {
			return "PESEL nieprawid³owy";
		}
		return plec(ustalLiczbe(pesel));
	}

}
