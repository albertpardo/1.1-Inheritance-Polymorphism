package level1ex1;

public class WindInstrument extends Instrument{

    static {
        System.out.println("WindInstrument class is called.");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}
