package level1ex2;

public class Car {
    private static final String BRAND = "DefaultBrand";
    private static String model;
    private final int power;


    public Car(int power){
        Car.model = "DefaultModel";
        this.power = power;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    public static void stop(){
        System.out.println("The vehicle is stoping");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    @Override
    public String toString() {
        return "Brand = " + BRAND + ", Model = " + model + ", Power=" + power;
    }
}
