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
    public void calculatePrice(MapOfPointsPricesForNews pointsPricesNewsMap){
        double total;
        double competitionPrice;
        double clubPrice;
        double playerPrice;

        competitionPrice = pointsPricesNewsMap.getPriceByKey(competition);
        clubPrice = pointsPricesNewsMap.getPriceByKey(club);
        playerPrice = pointsPricesNewsMap.getPriceByKey(player);
        total = START_PRICE + competitionPrice + clubPrice + playerPrice;
        System.out.println("Price for \"" + super.getTitle() + "\" -> "  + total + "€.");
    }

    @Override
    public void calculateScore(MapOfPointsPricesForNews pointsPricesNewsMap){
        double total;
        double competitionScore;
        double clubScore;
        double playerScore;

        competitionScore = pointsPricesNewsMap.getPointsByKey(competition);
        clubScore = pointsPricesNewsMap.getPointsByKey(club);
        playerScore = pointsPricesNewsMap.getPointsByKey(player);
        total = START_SCORE + competitionScore + clubScore + playerScore;
        System.out.println("Score for \"" + super.getTitle() + "\" -> "  + total + " Points.");
    }

    @Override
    public String toString() {
        return ("Title : " + super.getTitle() + ", Start Score : " + super.getScore() + ", Start Price : " + super.getPrice() + ", Competition: " + competition + ", Club : " + club + ", Player: " + player);
    }
}
