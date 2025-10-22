public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean getAvailable(){
        return !(isDirty) && !(isOccupied);
    }

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
        this.isAvailable = false;
    }

    public void checkOut(){
        cleanRoom();
        this.isAvailable = true;
        this.isOccupied = false;
    }
    public void cleanRoom(){
        this.isDirty = false;
    }
}
