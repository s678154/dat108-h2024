package no.hvl.dat108.f04;
import static javax.swing.JOptionPane.*;


public class test {
 public static void main(String[] args) {
	   // For-løkke for å lese inn poengsummer fra 10 studenter
         for (int i = 0; i < 10; i++) {
             int poengsum = -1; // Initialiser med en ugyldig verdi

             // Loop for å sikre at vi får en gyldig poengsum
             while (poengsum < 0 || poengsum > 100) {
                 // Les inn poengsum fra brukeren
                 String poengsumTxt = showInputDialog("Skriv inn poengsum for student " + (i + 1) + " (0-100):");
                 poengsum = Integer.parseInt(poengsumTxt);
                 if (poengsum < 0 || poengsum > 100) {
                     showMessageDialog(null, "Ugyldig poengsum. Vennligst skriv inn en verdi mellom 0 og 100.");
                 }                 
             }

             // Variabel for karakter
             String karakter;

             // Beregn karakteren basert på gyldig poengsum
             if (poengsum >= 90) {
                 karakter = "A";
             } else if (poengsum >= 80) {
                 karakter = "B";
             } else if (poengsum >= 70) {
                 karakter = "C";
             } else if (poengsum >= 60) {
                 karakter = "D";
             } else if (poengsum >= 50) {
                 karakter = "E";
             } else {
                 karakter = "F";
             }

             // Skriv ut karakteren
             showMessageDialog(null, "Karakteren for student " + (i + 1) + " er: " + karakter);
         }
     }
 }