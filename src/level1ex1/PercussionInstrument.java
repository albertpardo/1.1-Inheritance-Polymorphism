package level1ex1;

public class PercussionInstrument extends Instrument{
    public static final String PERCUSSION_INSTRUMENT = "percussion instrument";

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
