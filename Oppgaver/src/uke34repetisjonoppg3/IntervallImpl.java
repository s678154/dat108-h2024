package uke34repetisjonoppg3;

public class IntervallImpl<T extends Comparable<T>> implements Intervall<T> {
	private T minIntervall;
	private T maksIntervall;
	
	// Konstruktør
	public IntervallImpl(T minIntervall, T maksIntervall) {
		if (minIntervall.compareTo(maksIntervall) > 0) {
			throw new IllegalArgumentException("Minste verdi kan ikke være større enn største verdi.");
		}
		this.minIntervall = minIntervall;
		this.maksIntervall = maksIntervall;
	}

	@Override
	public boolean verdiErIEtIntervall(T verdi) {
		return verdi.compareTo(minIntervall) >= 0 && verdi.compareTo(maksIntervall) <= 0;	}

	@Override
	public boolean overlappendeIntervaller(T minIntervall2, T maksIntervall2) {
		return minIntervall.compareTo(maksIntervall2) <= 0 && maksIntervall.compareTo(minIntervall2) >= 0;
	}

	@Override
	public T minsteVerdiIEtIntervall() {
		return minIntervall;
	}

	@Override
	public T storsteVerdiIEtIntervall() {
		return maksIntervall;
	}


}

interface Intervall<T extends Comparable<T>> {
	boolean verdiErIEtIntervall(T verdi);
	boolean overlappendeIntervaller(T minIntervall2, T maksIntervall2);
	T minsteVerdiIEtIntervall();
	T storsteVerdiIEtIntervall();
}


