public class Seat {
    private String seatNumber; // Koltuk numarası
    private boolean isOccupied; // Koltuğun dolu veya boş olma durumu
    private String seatType; // Koltuk türü (business veya economy)

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isOccupied = false;
        this.seatType = "economy";
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
}
