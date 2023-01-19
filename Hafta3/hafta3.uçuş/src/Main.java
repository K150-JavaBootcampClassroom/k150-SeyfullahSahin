import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Uçuş Bilgilerini Giriniz:");

        System.out.print("Uçuş numarası: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Kalkış yeri: ");
        String departure = scanner.nextLine();

        System.out.print("Varış yeri: ");
        String arrival = scanner.nextLine();

        System.out.print("Tarih (GG/AA/YYYY): ");
        String dateString = scanner.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);

        System.out.print("Kapasite: ");
        int capacity = scanner.nextInt();

        System.out.print("Boş koltuk sayısı: ");
        int vacantSeats = scanner.nextInt();

        System.out.print("Yurtdışı uçuşu? (Evet: true, Hayır: false): ");
        boolean isInternational = scanner.nextBoolean();

        System.out.print("Uçuş şirketi: ");
        String companyName = scanner.nextLine();

        System.out.print("Yemek hizmeti var mı? (Evet: true, Hayır: false): ");
        boolean foodService = scanner.nextBoolean();

        Object Date;
        Flight flight = new Flight();
        double ticketPrice = flight.calculateTicketPriceWithServices();
        System.out.println("Bilet Fiyatı: " + ticketPrice);
    }
}
