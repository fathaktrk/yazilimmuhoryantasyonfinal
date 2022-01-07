import java.util.Scanner;

public class sayininIsaretiniBul{
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int girilenSayi=scn.nextInt();

		if(girilenSayi>0) {
		System.out.println("Sayınız Pozitif bir sayıdır.");
		} 
		else if (girilenSayi<0) {
		System.out.println("Sayınız Negatif bir sayıdır.");
		}
		else {
		System.out.println("Sayınız 0'dır, herhangi bir işareti yoktur.");
		}
	}
}