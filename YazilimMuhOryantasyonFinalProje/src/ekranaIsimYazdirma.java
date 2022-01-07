import java.util.Scanner;

public class ekranaIsimYazdirma{
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz: ");
		String isim=scn.next();
                System.out.println("Lütfen kaç kere yazılmasını istediğinizi giriniz: ");
                int istenilenSayi = scn.nextInt();
		for(int i=0;i<istenilenSayi;i++){
		System.out.println(isim);
		} 
	}
}