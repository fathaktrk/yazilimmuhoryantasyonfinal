import java.util.Scanner;
public class gecmeKalmaHesapla {
    public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Programa Hoş Geldiniz. Vize ve Final notlarınıza göre geçip/geçmediğiniz belli olacaktır. Geçme sınırı 50'dir");
		System.out.println("Vize Notunuzu giriniz: ");
		int vize= scn.nextInt();

		System.out.println("Final Notunuzu giriniz: ");
		int finalNotu= scn.nextInt();
		
		double ortalama = (vize*0.4)+(finalNotu*0.6);

		if(ortalama>49.99) {
		System.out.println("Tebrikler. Not ortalamanız: " + ortalama + " Geçtiniz.");
		} 
		else {
		System.out.println("Üzgünüm. Not ortalamanız: " + ortalama + " Kaldınız.");
		}
	}
}