import java.util.Scanner;

public class ATM {
    // başlangıç bakiyesi
    private static int balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Uygulamasına Hoşgeldiniz!");
            System.out.println("Lütfen işlem seçiniz:");
            System.out.println("1 - Para Çekme");
            System.out.println("2 - Para Yatırma");
            System.out.println("3 - Bakiye Öğrenme");
            System.out.println("4 - Çıkış");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
                    int amount = scanner.nextInt();
                    if (amount > balance) {
                        System.out.println("Bakiyeniz yetersiz. Lütfen daha az bir tutar giriniz.");
                    } else {
                        balance -= amount;
                        System.out.println(amount + " TL çekildi. Yeni bakiye: " + balance + " TL");
                    }
                    break;
                case 2:
                    System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz:");
                    amount = scanner.nextInt();
                    balance += amount;
                    System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance + " TL");
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + balance + " TL");
                    break;
                case 4:
                    System.out.println("ATM uygulamasından çıkış yapılıyor. Güle güle!");
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
