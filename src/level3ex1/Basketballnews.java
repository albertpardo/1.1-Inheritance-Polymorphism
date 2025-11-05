package level3ex1;

public class Basketballnews extends News {
    private String competition;
    private String club;

    public Basketballnews ( String title, String competition, String club) {
        super(title);
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
