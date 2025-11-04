package level1ex1;

public class PercussionInstrument extends Instrument{

    static {
        System.out.println("PercussionInstrument class is called.");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}
