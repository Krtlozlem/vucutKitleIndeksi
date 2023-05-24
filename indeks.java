import java.util.Scanner;

public class indeks {
    public static void main(String[] args) {
        int kilo;
        double boy, indeks;


        Scanner input =new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        System.out.print("Boyunuzu giriniz(metre cinsinden): ");
        boy = input.nextDouble();

          indeks = kilo / boy * boy;
        System.out.println("Vücut kitle indeksiniz: "+ indeks);



    }
}
