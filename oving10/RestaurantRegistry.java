import java.util.ArrayList;

public class RestaurantRegistry {
    private ArrayList<Restaurant> restaurants;

    public RestaurantRegistry() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addDishToRestaurant(String restaurantName, Dish dish) {
        Restaurant restaurant = findRestaurantByName(restaurantName);
        if (restaurant != null) {
            restaurant.addDish(dish);
        }
    }

    public Restaurant findRestaurantByName(String name) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                return restaurant;
            }
        }
        return null;
    }

}