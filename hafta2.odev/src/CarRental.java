import java.util.ArrayList;
import java.util.List;

public class CarRental {
    public static void main(String[] args) {

            // Normal vatandaşların kiralayabileceği Hatcbag arabalarının listesi
            List<Car> availableCars = new ArrayList<>();

            // Hatcbag aracın özelliklerini ayarlayın
            Car hatchback = new Car();
            hatchback.setModel("Hatchback");
            hatchback.setCapacity(5);
            hatchback.setDailyRate(50);
            hatchback.setColor("Red");

            // Listeye ekliyorum
            availableCars.add(hatchback);

            // Diğer arac modelleri için aynı işlemleri yapıyoruz

            // Kiralama işlemi için bir vatandaş hesabı oluşturun

            Customer customer = new Customer();
            customer.setType(CustomerType.NORMAL);

            // Kiralama süresi ve diğer bilgileri girin

            int rentalPeriod = 3;
            String rentalType = "daily";

            // Vatandaşın seçebileceği aracı modellerinin listesi

            List<Car> customerCars = new ArrayList<>();
            if (customer.getType() == CustomerType.NORMAL)
            {
                // Sadece Hatcbag aracı modellerini gösterin

                customerCars.addAll(availableCars);
            }
            else
            {
                // Tüm aracı modellerini gösterin

                customerCars.addAll(availableCars);

                // Diğer aracı modellerini de ekleyin
            }

            // Vatandaşın seçtiği aracın özelliklerini gösterin

            for (Car car : customerCars) {
                System.out.println("Model: " + car.getModel());
                System.out.println("Capacity: " + car.getCapacity());
                System.out.println("Color: " + car.getColor());

                int rentalFee;
                if (rentalType.equals("daily"))
                {
                    // Günlük kiralama ücretini hesaplayın
                    rentalFee = car.calculateDailyRentalFee(rentalPeriod);
                }
                else {
                    // Aylık kiralama ücretini hesaplayın
                    rentalFee = car.calculateMonthlyRentalFee(rentalPeriod);
                }
                System.out.println("Rental fee: " + rentalFee);
            }
        }

        public void run() {
        }
    }

    // Aracın sınıfı
    class Car {
        private String model;
        private int capacity;
        private int dailyRate;
        private String color;

        // Getter ve setter metodlarını tanımlıyorum
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getDailyRate() {
            return dailyRate;
        }

        public void setDailyRate(int dailyRate) {
            this.dailyRate = dailyRate;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Günlük kiralama ücretini hesaplayan metod
        public int calculateDailyRentalFee(int rentalPeriod) {
            return rentalPeriod * this.dailyRate;
        }

        // Aylık kiralama ücretini hesaplayan metod
        public int calculateMonthlyRentalFee(int rentalPeriod) {
            // Aylık kiralama ücreti günlük ücretlerin toplamına göre hesaplanır

            int dailyFee = this.calculateDailyRentalFee(rentalPeriod);
            return dailyFee * 30;
        }
    }

    // Vatandaşın sınıfı
    class Customer {
        private CustomerType type;

        // Getter ve setter metodlarını tanımlayın
        public CustomerType getType() {
            return type;
        }

        public void setType(CustomerType type) {
            this.type = type;
        }
    }

    // Vatandaş türleri için bir enum sınıfı
    enum CustomerType {
        NORMAL,
        COMPANY
    }


