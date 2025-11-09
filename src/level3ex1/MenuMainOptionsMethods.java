package level3ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuMainOptionsMethods {
    private void printWritersInfo(ArrayList<Writer> writers) {
        System.out.println("\n Writers Info: ");
        Iterator<Writer> it = writers.iterator();
        while (it.hasNext())
            System.out.println("- " + it.next().toString());
    }

    private void printWritersName(ArrayList<Writer> writers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Writers Names List: ");
        for (int i = 0; i < writers.size(); i++) {
            System.out.println(" - Id:" + i + "\tNAME: " + writers.get(i).getName());
        }
    }

    public void addWriter(ArrayList<Writer> writers) {
        String name;
        String dni;

        name = MenuUtils.inputStringByCli("Writer's name?");
        dni = MenuUtils.inputStringByCli("Writer's DNI?");
        writers.add(new Writer(name, dni));
        printWritersInfo(writers);
    }

    public void deleteWriter(ArrayList<Writer> writers) {
        int writerId;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1) {
            String name;

            name = writers.get(writerId).getName();
            writers.remove(writerId);
            System.out.println("\n " + name + " has been deleted!");
        }

    }

    public void assignNewsToWriter(ArrayList<Writer> writers) {
        int writerId;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1)
            MenuNews.start(writers.get(writerId));
    }

    public void deleteNews(ArrayList<Writer> writers) {
        int writerId;
        int newsId;
        Writer writer;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1) {
            writer = writers.get(writerId);
            newsId = MenuUtils.selectNewsIdByCli(writer);
            if (newsId > -1) {
                writer.deleteNewsById(newsId);
                System.out.println(" The news with ID = " + newsId + " has been deleted");
            }
        }
    }

    public void showNewsByWriter(ArrayList<Writer> writers) {
        int writerId;
        Writer writer;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1) {
            writer = writers.get(writerId);
            writer.printAssignedNews();
        }
    }

    public void calculateScoreNews(ArrayList<Writer> writers, MapOfPointsPricesForNews pointsPricesNewsMap) {
        int writerId;
        int newsId;
        Writer writer;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1) {
            writer = writers.get(writerId);
            newsId = MenuUtils.selectNewsIdByCli(writer);
            if (newsId > -1)
                writer.getAssignedNewsById(newsId).calculateScore(pointsPricesNewsMap);
        }
    }

    public void calculateNewsPrice(ArrayList<Writer> writers, MapOfPointsPricesForNews pointsPricesNewsMap) {
        int writerId;
        int newsId;
        Writer writer;

        writerId = MenuUtils.selectWriterIdByCli(writers);
        if (writerId > -1) {
            writer = writers.get(writerId);
            newsId = MenuUtils.selectNewsIdByCli(writer);
            if (newsId > -1)
                writer.getAssignedNewsById(newsId).calculatePrice(pointsPricesNewsMap);
        }
    }
}
