package level2ex1;

public class Smartphone extends Phone implements Camera,Clock {

    public Smartphone(String brand, String model){
        super(brand, model);
    }
    @Override
    public void photograph() {
        System.out.println("Taking a photo!");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing.");
    }
}
