package day1_git_GitHub;

public class Car {

    private final String brand;
    private String model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {

        this.brand = brand;
        setModel(model);
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {

        return brand;
    }
    public String getModel() {

        return model;
    }
    public String getColor() {

        return color;
    }
    public int getYear() {

        return year;
    }
    public double getPrice() {

        return price;
    }

    //-----------------

    public void setModel(String model) {

        if (model.equals("")) {

            throw new RuntimeException("invalid model given: "+ model);
        }
        this.model = model;
    }

    public void setColor(String color) {
        if (color.charAt(0) >= '0' && color.charAt(0) <= '9') {

            throw new RuntimeException("invalid color given: "+ color);
        }
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0) {

            throw new RuntimeException("invalid price provided: "+ price);
        }
        this.price = price;
    }

}
