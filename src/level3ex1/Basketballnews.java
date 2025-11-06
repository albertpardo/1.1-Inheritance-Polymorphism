package level3ex1;

public class Basketballnews extends News {
    private String competition;
    private String club;
    private static final double START_PRICE = 250.0;
    private static final double START_SCORE = 4.0;

    public Basketballnews ( String title, String competition, String club) {
        super(title, START_SCORE, START_PRICE);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public void calculatePrice() {
        //Todo
    }

    @Override
    public void calculateScore() {
        //Todo
    }
}
