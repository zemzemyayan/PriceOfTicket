package Projects;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * 
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
         * yapın.
         * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         * bilgilerini alın.
         * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam
         * fiyatını
         * hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri
         * uygulayın ;
         * 
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * 
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır
         * 
         * 
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int km = sc.nextInt();
        System.out.println("Yaşınızı giriniz :");
        int yas = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculkTipi = sc.nextInt();
        float tutar = km * (0.10f);
        if (yas < 0 || km < 0) {
            if (yolculkTipi != 1 || yolculkTipi != 2) {
                System.out.println("Hatalı veri girdiniz!");
            }

        }

        if (yas < 12) {
            tutar = (tutar - (tutar * 0.50f));
            if (yolculkTipi == 2) {
                tutar = (tutar - (tutar * 0.20f));
                System.out.println("tutar: " + tutar);
            } else if (yolculkTipi == 1) {
                System.out.println("tutar: " + tutar);
            }
        } else if (yas > 12 && yas < 24) {
            tutar = (tutar - (tutar * 0.10f));
            if (yolculkTipi == 2) {

                System.out.println("tutar: " + tutar);
            } else if (yolculkTipi == 1) {
                System.out.println("tutar: " + tutar);
            }
        } else if (yas > 65) {
            tutar = (tutar - (tutar * 0.30f));
            if (yolculkTipi == 2) {
                tutar = (tutar - (tutar * 0.20f));
            } else if (yolculkTipi == 1) {
                System.out.println("tutar: " + tutar);
            }
        }

        sc.close();
        ;

    }

}
