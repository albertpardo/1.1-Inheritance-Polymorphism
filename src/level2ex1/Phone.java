package level2ex1;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void phoneCall(String num){
        System.out.println("Calling to :" + num);
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model;
    }
}
