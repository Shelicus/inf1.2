package blatt07.johannes;

public class SimplifyOrTransform {
	
	/**  Formen Sie bitte die folgenden Ausdrücke etc. in vereinfachte Varianten um: */  
	static void toBeSimplified()
	{
		int a, b, c;
		
		// Beispiel: Mehrfache Initialisierung mit dem selben Wert:
		a = 0; b = 0; c = 0;
		// Vereinfacht:
		a = b = c = 0;
		
		a = (b = 1 + (c = 0));
		// Vereinfacht:
		//TODO:
		c = 0;
		a = b = 1;
		
		a = b = 0;
		a = b++ - (b += 2) - (b = 0);
		// Vereinfacht:
		//TODO 2 - (3+2) - 0; Assoziativitaet pruefen
		// a = b - (b + 3) - 0
		a = b - (b+3);// a = a - 2;
		b = 0;
		
		// Ändern Sie bitte ab auf, wo passend, Dekrement/Inkement-Opratoren 
		// oder kombinierte Zuweisungsoperatoren (jeweils ohne die Ausgabe zu ändern ...)
		final int N0 = 0, N1 = 17;
		for(int i = N0; i < N1; ++i) {
			System.out.print(i + ", ");
		}

		System.out.println();//int i = N1 - 1; i >= N0; i = i - 1
		for(int i = N1 - 1; i >= N0; --i) {
			System.out.print(i + ", ");
		}

		System.out.println();//int i = N0; i < N1; i = i + 2
		for(int i = N0; i < N1; i +=2) {
			System.out.print(i + ", ");
		}

		System.out.println();//int i = N1 - 1; i >= N0; i = i - 2
		for(int i = N1 - 1; i >= N0; i -=2) {
			System.out.print(i + ", ");
		}

		System.out.println();//int i = N0 + 1; i < N1 * N1; i = i + i
		for(int i = N0 + 1; i < N1 * N1; i *= 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// Formen Sie bitte die folgende while-Schleifen in for-Schleifen um 
		// und verwenden Sie wieder Inkrementoperatoren/kombinierte Zuweisungsoperatoren 

		/*a = 1;
		final int NMAX = 10;
		while(a < NMAX)
		{
			b = 1;
			while(b < NMAX) {
				System.out.printf("%3d", a * b);
				b = b + 1;
			}
			System.out.println();
			a = a + 1;
		}*/
		
		final int NMAX = 10;
		for(a = 1;a < NMAX; a++) {
			for(b = 1; b < NMAX; b++) {
				System.out.printf("%3d", a * b);
			}
			System.out.println();
		}


		/*System.out.println();
		a = 3; 
		while(a < 100)
		{
			b = 2;
			while(b*b < a && a % b != 0) {
				b = b + 1;
			}
			if(b * b > a) {
				System.out.print(a + ", ");
			}
			a = a + 2;
		} */
		
		System.out.println();
		for(a = 3; a < 100; a += 2) {
			for(b = 2; b*b < a && a % b != 0; b++) {
				
			}
			if(b * b > a) {
				System.out.print(a + ", ");
			}
		}
		
		// Transformieren Sie bitte folgende If-/Else-Kette in eine Switch-Anweisung
		/*int zufallsZahl = 1  + (int) (Math.random() * 6.);

		String seite;
		if(zufallsZahl == 1) {
			seite = "Eins"; 
		}
		else if(zufallsZahl == 2) {
			seite = "Zwei"; 
		}
		else if(zufallsZahl == 3) {
			seite = "Drei"; 
		}
		else if(zufallsZahl == 4) {
			seite = "Vier"; 
		}
		else if(zufallsZahl == 5) {
			seite = "Fünf"; 
		}
		else if(zufallsZahl == 6) {
			seite = "Sechs"; 
		}
		else  {
			seite = "Ungültig"; 
		}
		System.out.println("\nGewürfelt: " + seite );
		*/
		
		int zufallsZahl = 1  + (int) (Math.random() * 6.);
		String seite;
		switch(zufallsZahl) {
		case 1:
			seite = "Eins";
			break;
		case 2:
			seite = "Zwei";
			break;
		case 3:
			seite = "Drei";
			break;
		case 4:
			seite = "Vier";
			break;
		case 5:
			seite = "Fuenf";
			break;
		case 6:
			seite = "Sechs";
			break;
		default:
			seite = "Ungueltig";
			break;
		}
		System.out.println("\nGewuerfelt: " + seite );
	}
	public static void main(String[] args) {
		toBeSimplified();
	} 

}
