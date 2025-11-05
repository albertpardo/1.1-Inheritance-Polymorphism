package level3ex1;

public class Footballnews extends News{
    private String competition;
    private String club;
    private String player;

    public Footballnews(String title, String club){
        super(title);
        this.club = club;
    }

    @Override
    public void calculatePrice(){
        //TODO
    }

    @Override
    public void calculateScore(){
        //TODO
    }
}
