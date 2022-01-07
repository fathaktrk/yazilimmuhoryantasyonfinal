import java.util.Scanner;   
public class buyukSayiyiGosterenProgram {
    
    	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz: ");
		int birinciSayi = scn.nextInt();

		System.out.print("İkinci sayıyı giriniz: ");
		int ikinciSayi = scn.nextInt();
		
		if(birinciSayi>ikinciSayi) {
		System.out.println("Birinci sayı daha büyüktür. Birinci Sayı: " + birinciSayi);
		} 
		else if (birinciSayi<ikinciSayi) {
		System.out.println("İkinci sayı daha büyüktür. İkinci Sayı: " + ikinciSayi);
		}
		else {
		System.out.println("Sayılar birbirine eşittir.");
		}
	}
}
