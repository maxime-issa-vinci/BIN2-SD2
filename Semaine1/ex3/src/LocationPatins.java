import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static java.time.temporal.ChronoUnit.MILLIS;

public class LocationPatins {

	private List<Integer> liste= new ArrayList<>();
	public LocationPatins(int[] casiers) {
		for (int i = 0; i<casiers.length; i++){
			liste.add(casiers[i]);
		}
	}

	// date1 < date2
	private static double prix(LocalTime date1, LocalTime date2) {
		// 1 euro par milliseconde (c'est assez cher en effet)
		return MILLIS.between(date1, date2) ;
	}

	public int attribuerCasierAvecPatins(int pointure) {
		if (pointure < 33 || pointure > 48)
			throw new IllegalArgumentException();
		LocalTime l = LocalTime.now();
		

		//a compl�ter

	}

	public double libererCasier(int numeroCasier) {
		//a completer
	}

}
