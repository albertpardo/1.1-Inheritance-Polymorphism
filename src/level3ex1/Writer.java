package level3ex1;

import java.util.ArrayList;

public class Writer {
    private final String name;
    private final String dni;
    private static double salary;
    private final ArrayList<News> newsArrayList= new ArrayList<>();

    public Writer(String name, String dni){
        this.name = name;
        this.dni = dni;
        salary = 1500;
    }

    public String getName(){
        return name;
    }
    public void addNews(News news){
        newsArrayList.add(news);
    }

    public void printAssignedNews(){
        News news;
        for (int i = 0; i < newsArrayList.size(); i++){
            System.out.println("- ID :" + i + " , " + newsArrayList.get(i));
        }
    }

    public int getAssignedNewsSize(){
        return newsArrayList.size();
    }

    public News getAssignedNewsById(int id){
        return newsArrayList.get(id);
    }
    public void deleteNewsById(int newsId){
        newsArrayList.remove(newsId);
    }

    @Override
    public String toString(){
        return ("Name : " + name + ", DNI : " + dni + ", Salary: " + salary) ;
    }
}
