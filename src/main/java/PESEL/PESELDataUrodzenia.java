package PESEL;

import java.time.LocalDate;

public class PESELDataUrodzenia {
	private static PESELDataUrodzenia instancja;

	public static PESELDataUrodzenia getInstancja() {
		if (instancja == null) {
			instancja = new PESELDataUrodzenia();
		}
		return instancja;
	}

	private String rok = "";
	private String miesiac = "";
	private String dzien ="";

	private PESELDataUrodzenia() {

	}

	public LocalDate getData(String pesel) {
		ustal(pesel);
		System.out.println(rok+"-"+miesiac+"-"+dzien);
		return LocalDate.parse(rok+"-"+miesiac+"-"+dzien);
	}

	private void ustal(String pesel) {
		int tmp = 0;
		this.dzien = pesel.substring(4, 6);
		tmp = Integer.parseInt(pesel.substring(2, 4));

		if(tmp <=12) {
			if(tmp < 10) {
				this.miesiac += "0" + tmp;
			}
			else {
				this.miesiac += tmp;
			}
			this.rok += "19" + pesel.substring(0, 2);
		}
		else if(tmp <= 32) {
			this.miesiac += (tmp - 20);
			this.rok += "20" + pesel.substring(0, 2);
		}
		else if(tmp <= 52) {
			this.miesiac += (tmp - 40);
			this.rok += "21" + pesel.substring(0, 2);
		}
		else if(tmp <= 72) {
			this.miesiac += (tmp - 60);
			this.rok += "22" + pesel.substring(0, 2);
		}
		else {
			this.miesiac += (tmp - 80);
			this.rok += "18" + pesel.substring(0, 1);
		}
	}
}
