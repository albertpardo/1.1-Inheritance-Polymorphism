package level1ex1;

public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Abstact Instrument class is called.");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();
}
