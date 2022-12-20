import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        int count = 0;
        while (true) {
            // 0 ile 500 arasında rastgele bir sayı üret
            int number = rand.nextInt(500);

            // 50 ile 100 arasında bir sayı bulundu
            if (number >= 50 && number <= 100) {
                System.out.println(number + " sayısı " + count + ". seçimde bulundu");
                break;
            }

            count++;
        }
    }
}
