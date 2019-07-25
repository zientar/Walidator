package PESEL;

import java.util.HashMap;
import java.util.Map;

public class WagiDlaPozycjiPESEL {
	private static WagiDlaPozycjiPESEL instancja;

	public static WagiDlaPozycjiPESEL getInstancja() {
		if (instancja == null) {
			instancja = new WagiDlaPozycjiPESEL();
		}
		return instancja;
	}

	Map<Integer, Integer> wagi = new HashMap<Integer, Integer>();

	private WagiDlaPozycjiPESEL() {
		this.wagi.put(0, 1);
		this.wagi.put(1, 3);
		this.wagi.put(2, 7);
		this.wagi.put(3, 9);
		this.wagi.put(4, 1);
		this.wagi.put(5, 3);
		this.wagi.put(6, 7);
		this.wagi.put(7, 9);
		this.wagi.put(8, 1);
		this.wagi.put(9, 3);
	}

	public Integer GetWaga(Integer i) {
		return wagi.get(i);
	}

}
