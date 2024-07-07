package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory restaurantFactory = new RestaurantFactory();
        Restaurant italianRestaurant = restaurantFactory.createRestaurant("Italian", "Chef Mario");
        italianRestaurant.serveFood();
        italianRestaurant.takeReservation("John");

        Restaurant indianRestaurant = restaurantFactory.createRestaurant("Indian", 3);
        indianRestaurant.serveFood();
        indianRestaurant.takeReservation("Jane");
    }
}