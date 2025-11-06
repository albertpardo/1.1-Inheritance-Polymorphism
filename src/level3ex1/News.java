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

    public String getTitle() {
        return title;
    }

    public String getText(){
        return text;
    }

    public double getScore(){
        return score;
    }

    public double getPrice() {
        return price;
    }

    public void setScore(double score){
        this.score = score;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract void calculatePrice();
    public abstract void calculateScore();
}
