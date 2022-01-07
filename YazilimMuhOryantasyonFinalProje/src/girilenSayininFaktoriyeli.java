import java.util.Scanner;

public class girilenSayininFaktoriyeli {
	public static void main (String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Faktoriyelinin alınmasını istediğiniz sayıyı giriniz: ");	
	int deger = scn.nextInt();
        int faktoriyel = 1;
        for(int i = 1; i<= deger; i++){
            faktoriyel = faktoriyel * i;
        }        
        System.out.println("Girdiğiniz sayının faktoriyeli: " + faktoriyel);
	}	
                
}
