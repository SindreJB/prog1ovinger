public class MenuTest {

    public static void main(String[] args) {
        RestaurantRegistry menuRegistry = new RestaurantRegistry();
        Restaurant mcDees = new Restaurant("McDees");
        Restaurant suppeSindre = new Restaurant("SuppeSindre");
        menuRegistry.addRestaurant(mcDees);
        menuRegistry.addRestaurant(suppeSindre);
        mcDees.addDish(new Dish("Chicken Nuggets", 5.99, "Precourse"));
        mcDees.addDish(new Dish("Big Mac", 8.99, "Main course"));
        mcDees.addDish(new Dish("Quarter Pounder", 7.99, "Main course"));
        mcDees.addDish(new Dish("Apple Pie", 2.99, "Dessert"));
        mcDees.addDish(new Dish("McFlurry", 3.99, "Dessert"));
        suppeSindre.addDish(new Dish("Tomato Soup", 4.99, "Precourse"));
        suppeSindre.addDish(new Dish("Beef Stew", 9.99, "Main course"));
        suppeSindre.addDish(new Dish("Chicken Soup", 8.99, "Main course"));
        suppeSindre.addDish(new Dish("Chocolate Cake", 4.99, "Dessert"));
        suppeSindre.addDish(new Dish("Fruit Salad", 3.99, "Dessert"));

        System.out.println("Test 1: Find restaurant by name");
        Restaurant foundRestaurant = menuRegistry.findRestaurantByName("McDees");
        if (foundRestaurant != null) {
            System.out.println("Test 1: Passed");
        } else {
            System.out.println("Test 1: Failed");
        }

        System.out.println("Test 2: Find dish by name");
        for (Restaurant restaurant : menuRegistry.getRestaurants()) {
            for (Dish dish : restaurant.getMenu()) {
                if (dish.getName().equals("Big Mac")) {
                    System.out.println("Test 2: Passed");
                }
            }
        }

        System.out.println("Test 3: Add dish to restaurant");
        Dish dish = new Dish("Cheeseburger", 6.99, "Main course");
        menuRegistry.addDishToRestaurant("McDees", dish);
        for (Dish d : mcDees.getMenu()) {
            if (d.getName().equals("Cheeseburger")) {
                System.out.println("Test 3: Passed");
                return;
            }
        }
        
    }
}
