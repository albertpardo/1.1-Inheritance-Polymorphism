package level1ex2;

public class Main {
    static void infocar(String carVar, Car car){
        System.out.println(carVar + " Info : [" + car.toString() + "].");
    }
    public static void main(String[] args){
        String model;

        Car car1 = new Car(100);
        infocar("car1", car1);

        car1.accelerate();

        Car car2 = new Car(20);
        infocar("car2", car2);

        model = "Model_A";
        System.out.println("\ncar1 change the model to :" + model);
        car1.setModel(model);
        System.out.println("\n Now car1 and car2 has the same model:");
        infocar("car1", car1);
        infocar("car2", car2);


        Car.stop();
    }
}
