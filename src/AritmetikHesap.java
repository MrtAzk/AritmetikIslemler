import java.util.Scanner;

public class AritmetikHesap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b ;
        int c ;

        int FinalResult ;

        System.out.println("İlk Sayıyı giriniz : ");
        a =scanner.nextInt();

        System.out.println("İkinci Sayıyı giriniz : ");
        b =scanner.nextInt();

        System.out.println("Üçüncü Sayıyı giriniz : ");
        c =scanner.nextInt();

        FinalResult =a+(b*c)-b;

        System.out.println(FinalResult);

        scanner.close();


    }
}
