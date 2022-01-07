import java.util.Scanner;

public class verilenBesSayininToplami {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz: ");
		int birinciSayi = scn.nextInt();

		System.out.print("İkinci sayıyı giriniz: ");
		int ikinciSayi = scn.nextInt();

		System.out.print("Üçüncü sayıyı giriniz: ");
		int ucuncuSayi = scn.nextInt();

		System.out.print("Dördüncü sayıyı giriniz: ");
		int dorduncuSayi = scn.nextInt();

		System.out.print("Beşinci sayıyı giriniz: ");
		int besinciSayi = scn.nextInt();

		int toplam = birinciSayi+ikinciSayi+ucuncuSayi+dorduncuSayi+besinciSayi;
		System.out.println("Girdiğiniz beş sayının toplamı: " + toplam);
	}
}