package level3ex1;

public class Tennisnews extends News{
    private String player;
    private static final double START_PRICE = 150.0;
    private static final double START_SCORE = 4.0;

    public Tennisnews(String title, String player) {
        super(title, START_SCORE, START_PRICE);
        this.player = player;
    }

    @Override
    public void calculatePrice(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double playerPrice;

        playerPrice = pointsPricesNewsMap.getPriceByKey(player);
        total = START_PRICE + playerPrice;
        System.out.println("Price for \"" + super.getTitle() + "\" -> "  + total + "€.");
    }

    @Override
    public void calculateScore(MapOfPointsPricesForNews pointsPricesNewsMap) {
        double total;
        double playerScore;

        playerScore = pointsPricesNewsMap.getPointsByKey(player);
        total = START_SCORE + playerScore;
        System.out.println("Score for \"" + super.getTitle() + "\" -> "  + total + " Points.");
    }

    @Override
    public String toString() {
        return ("Title : " + super.getTitle() + ", Start Score : " + super.getScore() + ", Start Price : " + super.getPrice() + ", Player: " + player);
    }
}
