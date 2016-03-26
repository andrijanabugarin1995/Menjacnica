package interfejs;

import java.util.LinkedList;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKurs(Valuta kursZaDan);
	public void obrisiKurs(Valuta kursZaDan);
	public LinkedList<Valuta> pronadjiVratiKurs(String naziv, String skraceniNaziv, String kurs);
}
