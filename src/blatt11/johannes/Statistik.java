package blatt11.johannes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Klasse, um Mittelwert zu berechnen
 * 
 * @author Ulrich.Broeckl@hs-karlsruhe.de 
 *
 */
public class Statistik{
 	private double summe;

	protected double n;
	
	String name;
	
	
	/** Konstruktor 
	 * @param name Identifikator/Name für die Statistik
	 */
	public Statistik(String name) {
		this.name = name;
		this.summe = this.n = 0.;
	}
	
	/** Einen neuen Wert der Statistik hinzufügen
	 * 
	 * @param wert
	 */
	public void addWert(double wert) {
		this.n++;
		this.summe += wert;
	}

	/**
	 * Durchschnitt berechnen
	 * @return Durchschnitt aller Werte
	 */
	double getDurchschnitt() {
		return this.summe / this.n;
	}
	
	/** Statistik in Zeichenkette ausgeben
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%12s: n==%10.0f, µ==%8f", 
				this.name, this.n, this.getDurchschnitt() );
	}
	
	
	/** Statistik in Datei mit dem Namen der Statistik und der Endung ".statistik" ausgeben
	 * @see <a href="https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java">...</a>
	 */
	public void writeToFile()  {
		try {
			Files.write(Paths.get(this.name + ".statistik"), this.toString().getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}