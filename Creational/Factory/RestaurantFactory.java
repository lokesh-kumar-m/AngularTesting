package Creational.Factory;

public class RestaurantFactory {
    public Restaurant createRestaurant(String type, Object... args) {
        if (type.equalsIgnoreCase("Italian")) {
            if (args.length > 0 && args[0] instanceof String) {
                String chefName = (String) args[0];
                return new ItalianRestaurant(chefName);
            } else {
                throw new IllegalArgumentException("Invalid arguments for Italian restaurant");
            }
        } else if (type.equalsIgnoreCase("Indian")) {
            if (args.length > 0 && args[0] instanceof Integer) {
                int spiceLevel = (int) args[0];
                return new IndianRestaurant(spiceLevel);
            } else {
                throw new IllegalArgumentException("Invalid arguments for Indian restaurant");
            }
        } else {
            throw new IllegalArgumentException("Invalid restaurant type: " + type);
        }
    }
}