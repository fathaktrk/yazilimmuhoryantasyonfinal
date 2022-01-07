import java.util.Scanner;
public class notuRakamaCevirme {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int not = scn.nextInt();
        int rakamNotu = (not-(not%20))/20+1;
        System.out.println("Rakam notunuz: " + rakamNotu);
    }
}