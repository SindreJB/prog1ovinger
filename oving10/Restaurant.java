import java.util.ArrayList;

public class Restaurant {
    private final String name;
    private ArrayList<Dish> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dish> getMenu() {
        return menu;
    }

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public double getTotalMenuPrice() {
        double totalPrice = 0;
        for (Dish dish : menu) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }
}