package walidator.DowodOsobisty;

import java.util.HashMap;
import java.util.Map;

public class WartosciDlaZnakow {
	Map<Character, Integer> wartosci = new HashMap<Character, Integer>();

	public WartosciDlaZnakow() {
		this.wartosci.put('A', 10);
		this.wartosci.put('B', 11);
		this.wartosci.put('C', 12);
		this.wartosci.put('D', 13);
		this.wartosci.put('E', 14);
		this.wartosci.put('F', 15);
		this.wartosci.put('G', 16);
		this.wartosci.put('H', 17);
		this.wartosci.put('I', 18);
		this.wartosci.put('J', 19);
		this.wartosci.put('K', 20);
		this.wartosci.put('L', 21);
		this.wartosci.put('M', 22);
		this.wartosci.put('N', 23);
		this.wartosci.put('O', 24);
		this.wartosci.put('P', 25);
		this.wartosci.put('Q', 26);
		this.wartosci.put('R', 27);
		this.wartosci.put('S', 28);
		this.wartosci.put('T', 29);
		this.wartosci.put('U', 30);
		this.wartosci.put('V', 31);
		this.wartosci.put('W', 32);
		this.wartosci.put('X', 33);
		this.wartosci.put('Y', 34);
		this.wartosci.put('Z', 35);
	}
	public Integer GetWartosc(Character znak) {
		return wartosci.get(znak);
	}
}
