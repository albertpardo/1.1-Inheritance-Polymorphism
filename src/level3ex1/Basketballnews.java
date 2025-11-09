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
    public void calculatePrice(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double competitionPrice;
        double clubPrice;

        competitionPrice = pointsPricesNewsMap.getPriceByKey(competition);
        clubPrice = pointsPricesNewsMap.getPriceByKey(club);
        total = START_PRICE + competitionPrice + clubPrice;
        System.out.println("Price for \"" + super.getTitle() + "\" -> "  + total + "€.");
    }

    @Override
    public void calculateScore(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double competitionScore;
        double clubScore;

        competitionScore = pointsPricesNewsMap.getPointsByKey(competition);
        clubScore = pointsPricesNewsMap.getPointsByKey(club);
        total = START_SCORE + competitionScore + clubScore;
        System.out.println("Score for \"" + super.getTitle() + "\" -> "  + total + " Points.");
    }

    @Override
    public String toString() {
        return ("Title : " + super.getTitle() + ", Start Score : " + super.getScore() + ", Start Price : " + super.getPrice() + ", Competition: " + competition + ", Club : " + club);
    }
}
