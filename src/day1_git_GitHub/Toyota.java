package day1_git_GitHub;

public class Toyota extends Car {

    private boolean madeInJapan;
    public Toyota(String brand, String model, String color, int year, double price, String fuel, boolean madeInJapan) {

        super(brand,model,color,year,price,fuel);
        setMadeInJapan(madeInJapan);
    }
    public void start() {

        System.out.println(getBrand()+ " "+ getModel()+ " is started by key !!!");
    }

    public boolean getMadeIsJapan() {

        return madeInJapan;
    }

    public void setMadeInJapan(boolean madeInJapan) {
        this.madeInJapan = madeInJapan;
    }
}
