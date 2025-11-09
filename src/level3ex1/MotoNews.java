package level3ex1;

public class MotoNews extends News {
    private final String stable;
    private static final double START_PRICE = 100.0;
    private static final double START_SCORE = 3.0;

    public MotoNews(String title, String stable) {
        super(title, START_SCORE, START_PRICE);
        this.stable = stable;
    }

    @Override
    public void calculatePrice(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double stablePrice;

        stablePrice = pointsPricesNewsMap.getPriceByKey(stable);
        total = START_PRICE + stablePrice;
        System.out.println("Price for \"" + super.getTitle() + "\" -> "  + total + "€.");
    }

    @Override
    public void calculateScore(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double stableScore;

        stableScore = pointsPricesNewsMap.getPointsByKey(stable);
        total = START_SCORE + stableScore;
        System.out.println("Score for \"" + super.getTitle() + "\" -> "  + total + " Points.");
    }

    @Override
    public String toString() {
        return ("Title : " + super.getTitle() + ", Start Score : " + super.getScore() + ", Start Price : " + super.getPrice() + ", Motocycle Stable : " + stable);
    }
}
