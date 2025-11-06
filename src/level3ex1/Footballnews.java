package level3ex1;

public class Footballnews extends News{
    private String competition;
    private String club;
    private String player;

    public Footballnews(String title, String competition, String club, String player){
        super(title);
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
        return ("Title : " + super.getTitle() + "\n Score : " + super.getScore() + "\n Price : " + super.getPrice() + "\n Competition: " + competition + "\n Club : " + club + "\n Player: " + player);
    }
}
