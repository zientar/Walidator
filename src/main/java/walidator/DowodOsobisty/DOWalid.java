package walidator.DowodOsobisty;

public class DOWalid {
	private Integer cyfraKontrolna;
	private Integer sumaKontrolna;

	private void obliczSumeKontrolna(String dowod) {
		int tmp = 0;
		WartosciDlaZnakow t1 = WartosciDlaZnakow.getInstancja();
		WagiDlaPozycji t2 = WagiDlaPozycji.getInstancja();
		for (int i = 0; i <= 2; i++) {
			tmp += (t1.GetWartosc(dowod.charAt(i)) * t2.GetWaga(i));
		}
		for (int i = 4; i <= 8; i++) {
			tmp += Character.getNumericValue(dowod.charAt(i)) * t2.GetWaga(i);
		}
		this.sumaKontrolna = tmp;
	}

	private boolean sprawdzDlugosc(String dowod) {
		if (dowod.length() == 9) {
			return true;
		}
		return false;
	}

	private void ustalCyfreKontrolna(String dowod) {
		this.cyfraKontrolna = Character.getNumericValue(dowod.charAt(3));
	}

	public boolean walid(String dowod) {

		try {
			if (!sprawdzDlugosc(dowod)) {
				return false;
			}
			obliczSumeKontrolna(dowod);
			ustalCyfreKontrolna(dowod);
			if (cyfraKontrolna == (sumaKontrolna % 10)) {
				return true;
			}
			return false;

		} catch (Exception e) {
			return false;
		}

	}

}
