package uke34laboppgaver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Film{
	private String tittel;
	private String regissor;
	private int utgivelsesaar;
	private double imdbRating;
	
	
	public Film(String tittel, String regissor, int utgivelsesaar, double imdbRating) {
		super();
		this.tittel = tittel;
		this.regissor = regissor;
		this.utgivelsesaar = utgivelsesaar;
		this.imdbRating = imdbRating;
	}
	
	
	
	public String getTittel() {
		return tittel;
	}



	public void setTittel(String tittel) {
		this.tittel = tittel;
	}



	public String getRegissor() {
		return regissor;
	}



	public void setRegissor(String regissor) {
		this.regissor = regissor;
	}



	public int getUtgivelsesaar() {
		return utgivelsesaar;
	}



	public void setUtgivelsesaar(int utgivelsesaar) {
		this.utgivelsesaar = utgivelsesaar;
	}



	public double getImdbRating() {
		return imdbRating;
	}



	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}
	
	@Override
    public String toString() {
        return "Film{" +
                "tittel='" + tittel + '\'' +
                ", regissor='" + regissor + '\'' +
                ", utgivelsesaar=" + utgivelsesaar +
                ", imdbRating=" + imdbRating +
                '}';
    }

	public static void main(String[] args) {
		
		List<Film> filmene = Arrays.asList(
				new Film("The Godfather", "Francis Ford Coppola", 1972, 9.1),
				new Film("The Dark Knight", "Christopher Nolan", 2008, 9.0),
				new Film("Pulp Fiction", "Quentin Tarantino", 1994, 8.9),
				new Film("Fight Club", "David Fincher", 1999, 8.8));
		
		// A)
		System.out.println("Før sortering:");
	    filmene.forEach(System.out::println);
	    
	    Collections.sort(filmene, (a, b) -> a.getTittel().toLowerCase().compareTo(b.getTittel().toLowerCase()));
	    
	    System.out.println("\nEtter sortering på tittel:");
        filmene.forEach(System.out::println);
		
		//B)
        Comparator<Film> paaUtgivelsesaar = (a,b) -> Integer.compare(a.getUtgivelsesaar(), b.getUtgivelsesaar());
        Collections.sort(filmene, paaUtgivelsesaar);
        System.out.println("\nEtter sortering på utgivelsesår");
        filmene.forEach(System.out::println);
	}

	
	
	
}
