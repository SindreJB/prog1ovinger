public class Dish {
    private final String name;
    private final double price;
    private final String course;

    public Dish(String name, double price, String course) {
        this.name = name;
        this.price = price;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCourse() {
        return course;
    }
}
