import java.util.Scanner;

public class uceVeBeseBolunebilme {
	public static void main (String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Lütfen bir sayı giriniz ");	
	int alinanSayi = scn.nextInt();
            if (alinanSayi%3 == 0 && alinanSayi%5==0) {
                System.out.println("Sayınız hem 3'e hemde 5'e bölünmektedir.");
            } else if (alinanSayi%3 == 0 || alinanSayi%5==0) {
                System.out.println("Sayınız sadece 3 ya da 5'e bölünebilmektedir. İkisine bölünememektedir.");
            } else {
                System.out.println("Sayınız 3'e ya da 5'e bölünememektedir.");
            }
    }	          
}
