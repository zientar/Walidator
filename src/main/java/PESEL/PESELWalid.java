package PESEL;

public class PESELWalid {
	private static PESELWalid instancja;
	public static PESELWalid getInstancja() {
		if(instancja == null) {
			return instancja = new PESELWalid();
		}
		return instancja;
	}
	private Integer cyfraKontrolna;

	private Integer sumaKontrolna;

	private PESELWalid() {

	}

	private void obliczSumeKontrolna(String pesel) {
		int tmp = 0;
		WagiDlaPozycjiPESEL t1 = WagiDlaPozycjiPESEL.getInstancja();
		for (int i = 0; i <= 9; i++) {
			tmp += Character.getNumericValue(pesel.charAt(i)) * t1.GetWaga(i);
		}
		sumaKontrolna = tmp;
	}

	private boolean sprawdzDlugosc(String pesel) {
		if (pesel.length() == 11) {
			return true;
		}
		return false;
	}

	private void ustalCyfreKontrolna(String pesel) {
		this.cyfraKontrolna = Character.getNumericValue(pesel.charAt(10));
	}

	public boolean walid(String pesel) {
		try {
			if (!sprawdzDlugosc(pesel)) {
				return false;
			}
			obliczSumeKontrolna(pesel);
			ustalCyfreKontrolna(pesel);

			if (cyfraKontrolna == ((10 - (sumaKontrolna % 10)) % 10)) {
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
