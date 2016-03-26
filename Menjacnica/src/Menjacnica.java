import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;
import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> kursevi = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta kursZaDan) {
			kursevi.add(kursZaDan);
	}

	@Override
	public void obrisiKurs(Valuta kursZaDan) {
		kursevi.remove(kursZaDan);

	}

	@Override
	public LinkedList<Valuta> pronadjiVratiKurs(String naziv, String skraceniNaziv, String kurs) {
		LinkedList<Valuta> rezultat = new LinkedList<Valuta>();
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getKurs().contains(kurs)){
				rezultat.add(kursevi.get(i));
			}
		}
		return rezultat;
	}
	
	

}
