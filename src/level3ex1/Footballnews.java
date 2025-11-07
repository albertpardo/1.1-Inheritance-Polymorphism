package level3ex1;

public class Footballnews extends News{
    private String competition;
    private String club;
    private String player;
    private static final double START_PRICE = 300.0;
    private static final double START_SCORE = 5.0;

    public Footballnews(String title, String competition, String club, String player){
        super(title, START_SCORE, START_PRICE);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public void calculatePrice(){
        //TODO
    }

    @Override
    public void calculateScore(){
        //TODO
    }

    @Override
    public String toString() {
        return ("Title : " + super.getTitle() + ", Score : " + super.getScore() + ", Start Price : " + super.getPrice() + ", Competition: " + competition + ", Club : " + club + ", Player: " + player);
    }
}
