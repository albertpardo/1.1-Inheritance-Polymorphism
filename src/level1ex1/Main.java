package level1ex1;

public class Main {
    public static void main(String[] args){
        System.out.println(" --- calling static vars in class (The class is not load in memory ---");
        System.out.println( "Acces to Public Static Var in Instrument : " + Instrument.INSTRUMENT);
        System.out.println( "Acces to Public Static Var in PercussionInstrument : " + PercussionInstrument.PERCUSSION_INSTRUMENT);

        System.out.println("\n --- Creating objects ---");
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
