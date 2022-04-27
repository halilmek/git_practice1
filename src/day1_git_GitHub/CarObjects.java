package day1_git_GitHub;

public class CarObjects {

    public static void main(String[] args) {

        Toyota toy1 = new Toyota("Camry","purple",2020,33200,"fuel",true);
        System.out.println("toy1 = " + toy1);

        Tesla tes1 = new Tesla("S1","dark blue", 2021, 39200, "battery", false);
        System.out.println("tes1 = " + tes1);
    }
}
