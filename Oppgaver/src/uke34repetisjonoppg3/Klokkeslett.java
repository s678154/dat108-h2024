package uke34repetisjonoppg3;

import java.util.Objects;

public class Klokkeslett implements Comparable<Klokkeslett> {
	
	private int time;
	private int minutt;
	
	public Klokkeslett(int time, int minutt) {
        if (time < 0 || time >= 24 || minutt < 0 || minutt >= 60) {
            throw new IllegalArgumentException("Ugyldig klokkeslett: time må være mellom 0 og 23, minutt mellom 0 og 59.");
        }
        this.time = time;
        this.minutt = minutt;
    }
	
	public int getTime() {
        return time;
    }

    public int getMinutt() {
        return minutt;
    }
	
	@Override
	public int compareTo(Klokkeslett annetKlokkeslett) {
		 if (this.time != annetKlokkeslett.time) {
	            return Integer.compare(this.time, annetKlokkeslett.time);
	        } else return Integer.compare(this.minutt, annetKlokkeslett.minutt);
	}
	
	 
	
	@Override
	public int hashCode() {
		return Objects.hash(minutt, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klokkeslett other = (Klokkeslett) obj;
		return minutt == other.minutt && time == other.time;
	}

	@Override
    public String toString() {
        return String.format("%02d:%02d", time, minutt);
    }

}
