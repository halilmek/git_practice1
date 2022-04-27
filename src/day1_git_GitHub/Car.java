package day1_git_GitHub;

public abstract class Car {

    private final String brand;
    private String model;
    private String color;
    private final int year;
    private double price;
    private final String fuel;

    public Car(String brand, String model, String color, int year, double price, String fuel) {

        this.brand = brand;
        setModel(model);
        setColor(color);

        if (year <= 1995) {

            throw new RuntimeException("invalid year given: "+ year);
        }
        this.year = year;
        setPrice(price);

        if (!(fuel.equalsIgnoreCase("diesel") || fuel.equalsIgnoreCase("fuel") || fuel.equalsIgnoreCase("gas"))){
            throw new RuntimeException("invalid fuel type given: "+ fuel);
        }
        this.fuel = fuel;
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

    public abstract void start();

    public String toString() {

        return "Car {\nbrand = "+ getBrand()+
                "\nmodel = "+ getModel()+
                "\ncolor = "+ getColor()+
                "\nyear = "+ getYear()+
                "\nprice = "+ getPrice()+
                "\nfeul = "+ fuel+
                "}";
    }
}
