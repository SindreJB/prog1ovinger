import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {

        RestaurantRegistry menuRegistry = new RestaurantRegistry();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        Restaurant mcDees = new Restaurant("McDees");
        Restaurant suppeSindre = new Restaurant("SuppeSindre");

        menuRegistry.addRestaurant(mcDees);
        menuRegistry.addRestaurant(suppeSindre);

        // Add dishes to McDees
        mcDees.addDish(new Dish("Chicken Nuggets", 5.99, "Precourse"));
        mcDees.addDish(new Dish("Big Mac", 8.99, "Main course"));
        mcDees.addDish(new Dish("Quarter Pounder", 7.99, "Main course"));
        mcDees.addDish(new Dish("Apple Pie", 2.99, "Dessert"));
        mcDees.addDish(new Dish("McFlurry", 3.99, "Dessert"));

        // Add dishes to SuppeSindre
        suppeSindre.addDish(new Dish("Tomato Soup", 4.99, "Precourse"));
        suppeSindre.addDish(new Dish("Beef Stew", 9.99, "Main course"));
        suppeSindre.addDish(new Dish("Chicken Soup", 8.99, "Main course"));
        suppeSindre.addDish(new Dish("Chocolate Cake", 4.99, "Dessert"));
        suppeSindre.addDish(new Dish("Fruit Salad", 3.99, "Dessert"));

        // Main program loop
        while (running) {
            System.out.println("1. Registrer rett");
            System.out.println("2. Skriv ut alle retter");
            System.out.println("3. Søk etter rett");
            System.out.println("4. Søk i retter av type");
            System.out.println("5. Print restaurant meny");
            System.out.println("6. Opprett ny restaurant");
            System.out.println("7. Finn meny med totalpris mellom to verdier");
            System.out.println("8. Avslutt");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Velg restaurant:");
                        for (int i = 0; i < menuRegistry.getRestaurants().size(); i++) {
                            System.out.println((i + 1) + ". " + menuRegistry.getRestaurants().get(i).getName());
                        }
                        int restaurantChoice = sc.nextInt();
                        sc.nextLine();

                        if (restaurantChoice < 1 || restaurantChoice > menuRegistry.getRestaurants().size()) {
                            System.out.println("Ugyldig valg.");
                            break;
                        }

                        Restaurant selectedRestaurant = menuRegistry.getRestaurants().get(restaurantChoice - 1);

                        System.out.println("Skriv inn navn på rett: ");
                        String name = sc.nextLine();
                        System.out.println("Skriv inn pris: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Hvilken type rett er det?");
                        String course = sc.nextLine();

                        Dish dish = new Dish(name, price, course);
                        selectedRestaurant.addDish(dish);
                    }

                    case 2 -> {
                        System.out.println("Retter i registeret:");
                        for (Restaurant restaurant : menuRegistry.getRestaurants()) {
                            System.out.println("Restaurant: " + restaurant.getName());
                            for (Dish dish : restaurant.getMenu()) {
                                System.out.println("Dish: " + dish.getName() + ", Price: " + dish.getPrice());
                            }
                            System.out.println();
                        }
                    }

                    case 3 -> {
                        System.out.println("Skriv inn navn på rett: ");
                        String name = sc.nextLine();
                        for (Restaurant restaurant : menuRegistry.getRestaurants()) {
                            for (Dish dish : restaurant.getMenu()) {
                                if (dish.getName().equalsIgnoreCase(name)) {
                                    System.out.println("Restauranten: " + restaurant.getName() + " Har retten: " + dish.getName() + ", Price: " + dish.getPrice());
                                }
                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("Skriv inn type rett: ");
                        String course = sc.nextLine();
                        for (Restaurant restaurant : menuRegistry.getRestaurants()) {
                            for (Dish dish : restaurant.getMenu()) {
                                if (dish.getCourse().equalsIgnoreCase(course)) {
                                    System.out.println("Liste over alle retter av type " + course + ":");
                                    System.out.println("Dish: " + dish.getName() + ", Price: " + dish.getPrice());
                                }
                            }
                        }
                    }

                    case 5 -> {
                        System.out.println("Skriv inn navn på restaurant: ");
                        String name = sc.nextLine();
                        Restaurant restaurant = menuRegistry.findRestaurantByName(name);
                        if (restaurant != null) {
                            System.out.println("Meny for " + restaurant.getName() + ":");
                            for (Dish dish : restaurant.getMenu()) {
                                System.out.println("Dish: " + dish.getName() + ", Price: " + dish.getPrice());
                            }
                        } else {
                            System.out.println("Fant ikke restaurant.");
                        }
                    }

                    case 6 -> {
                        System.out.println("Skriv inn navn på restaurant: ");
                        String name = sc.nextLine();
                        menuRegistry.addRestaurant(new Restaurant(name));
                    }

                    case 7 -> {
                        System.out.println("Skriv inn minimum pris: ");
                        double minPrice = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Skriv inn maksimum pris: ");
                        double maxPrice = sc.nextDouble();
                        sc.nextLine();

                        for (Restaurant restaurant : menuRegistry.getRestaurants()) {
                            double totalPrice = restaurant.getTotalMenuPrice();
                            if (totalPrice >= minPrice && totalPrice <= maxPrice) {
                                System.out.println("Restaurant: " + restaurant.getName() + " har en totalpris på " + totalPrice);
                            }
                        }
                    }

                    case 8 -> {
                        running = false;
                        System.out.println("Avslutter programmet. Hadefettebra");
                    }
                    default -> System.out.println("Ugyldig input, kukk.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Fettoter.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("En feil oppstod: " + e.getMessage());
            }
        }
        sc.close();
    }
}
