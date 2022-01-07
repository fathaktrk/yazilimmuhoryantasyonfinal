import java.util.Scanner;

public class fiyataKDVEkleme{
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Fiyatı giriniz: ");
		double fiyat=scn.nextDouble();
		fiyat+=(fiyat*0.18);
		System.out.println("Ürünün KDV'li fiyatı: " + fiyat);
		} 
	}