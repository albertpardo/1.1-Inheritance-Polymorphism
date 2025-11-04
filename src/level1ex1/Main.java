package level1ex1;

public class Main {
    public static void main(String[] args){
        PercussionInstrument bongo = new PercussionInstrument("Bongo", 1000.0);
        bongo.play();
        System.out.println();

        StringInstrument guitar = new StringInstrument("Guitar", 250.45);
        guitar.play();
        System.out.println();

        WindInstrument clarinet = new WindInstrument("Clarinet", 550.85);
        clarinet.play();
        System.out.println();

        PercussionInstrument drum = new PercussionInstrument("Drum", 1550.38);
        drum.play();
        System.out.println();

        StringInstrument violin = new StringInstrument("Violin",426.53);
        violin.play();
        System.out.println();

        WindInstrument flute = new WindInstrument( "Flute", 38.23);
        flute.play();
    }
}
