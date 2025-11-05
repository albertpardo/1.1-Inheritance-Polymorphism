package level3ex1;

public abstract class News {
    private String title;
    private static String text;
    private double score;
    private double price;

    public News(String title){
        this.title = title;
        this.text = "";
        this.score = 0.0;
        this.price = 0.0;
    }

    public abstract void calculatePrice();
    public abstract void calculateScore();
}
