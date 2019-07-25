package walidator.DowodOsobisty;

import java.util.HashMap;
import java.util.Map;

public class WagiDlaPozycjiDO {
	private static WagiDlaPozycjiDO instancja;

	public static WagiDlaPozycjiDO getInstancja() {
		if (instancja == null) {
			instancja = new WagiDlaPozycjiDO();
		}
		return instancja;
	}

	Map<Integer, Integer> wagi = new HashMap<Integer, Integer>();

	private WagiDlaPozycjiDO() {
		this.wagi.put(0, 7);
		this.wagi.put(1, 3);
		this.wagi.put(2, 1);
		this.wagi.put(4, 7);
		this.wagi.put(5, 3);
		this.wagi.put(6, 1);
		this.wagi.put(7, 7);
		this.wagi.put(8, 3);
	}

	public Integer GetWaga(Integer i) {
		return wagi.get(i);
	}

}
