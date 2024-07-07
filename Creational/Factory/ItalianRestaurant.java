package Creational.Factory;

public class ItalianRestaurant implements Restaurant {
    private String chefName;

    public ItalianRestaurant(String chefName) {
        this.chefName = chefName;
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Italian food...");
    }

    @Override
    public void takeReservation(String customerName) {
        System.out.println("Taking reservation for " + customerName + " at Italian restaurant with chef " + chefName);
    }
}