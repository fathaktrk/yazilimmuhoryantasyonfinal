import java.util.Scanner;

public class istenilenSayiyaKadarYazdirma{
	public static void main (String[] args) {   
            Scanner scn = new Scanner(System.in);
            System.out.println("Sayı 1'den başlayacaktır. Kaça kadar yazmasını istersiniz? Giriniz: ");
            int istenilenSayi=scn.nextInt();
            	int j=1;
		for(int i=0;i<istenilenSayi;i++){
		System.out.println(j);
		j+=1;
		} 
	}
}