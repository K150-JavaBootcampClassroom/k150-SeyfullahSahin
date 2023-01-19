import java.util.Date;

public class Flight {
    private String flightNumber; // Uçuş numarası
    private String seatType; // Uçuş türü
    private String departure; // Kalkış yeri
    private String arrival; // Varış yeri
    private Date date; // Uçuş tarihi
    private Seat[][] seats; // Koltukları tutan 2 boyutlu dizi
    private boolean isInternational; // Uçuşun yurtiçi veya yurtdışı olması
    private String companyName; // Uçuş şirketi
    private boolean foodService; // Uçak içi yemek hizmeti varlığı

    // Uçuşun ilklendirilmesi için constructor
    public Flight(String flightNumber, String departure, String arrival, Date date, int rows, int columns, boolean isInternational, String companyName, boolean foodService) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.date = date;
        this.seats = new Seat[rows][columns];
        this.isInternational = isInternational;
        this.companyName = companyName;
        this.foodService = foodService;
        // Koltukların ilklendirilmesi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = new Seat((char)('A' + i) + "" + (j+1));
            }
        }
    }
    public Flight() {

    }

    // Boş koltukları gösteren metod
    public void showAvailableSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j].isOccupied()) {
                    System.out.println("Koltuk Numarası: " + seats[i][j].getSeatNumber() + ", Koltuk Türü: " + seats[i][j].getSeatType());
                }
            }
        }
    }
    // Bilet fiyatını hesaplayan metod
    public double calculateTicketPriceWithServices() {
        double basePrice = 500; // Temel fiyat
        if(seatType.equals("business")){ // Eğer koltuk business sınıfındaysa
            basePrice += 200; // Fiyatı arttır
        }
        if(isInternational){ // Eğer uçuş yurtdışıysa
            basePrice += 100; // Fiyatı arttır
        }
        if(companyName.equals("Pegasus") && !isInternational){ // Eğer uçuş şirketi Pegasus ve yurtiçi ise
            basePrice -= 50; // Fiyatı azalt
        }
        if(foodService){ // Eğer yemek hizmeti var ise
            basePrice += 25; // Fiyatı arttır
        }
        return basePrice; // hesaplanan fiyatı döndür
    }
}



