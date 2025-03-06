import java.util.Scanner;

public class AritmetikHesap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Değişkenler burada yapılıyor
        int a;
        int b ;
        int c ;

        int FinalResult ;
        //Kullanıcıdan değer girilmesi isteniyor
        System.out.println("İlk Sayıyı giriniz : ");
        a =scanner.nextInt();

        System.out.println("İkinci Sayıyı giriniz : ");
        b =scanner.nextInt();

        System.out.println("Üçüncü Sayıyı giriniz : ");
        c =scanner.nextInt();
        //İşlem önceliğine göre hesaplanıyor
        FinalResult =a+(b*c)-b;
        //Sonuç giriliyor
        System.out.println(FinalResult);

        scanner.close();


    }
}
