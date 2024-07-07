package Creational.Factory;

class IndianRestaurant implements Restaurant {
    private int spiceLevel;

    public IndianRestaurant(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Indian food with spice level " + spiceLevel + "...");
    }

    @Override
    public void takeReservation(String customerName) {
        System.out.println("Taking reservation for " + customerName + " at Indian restaurant with spice level " + spiceLevel);
    }
}