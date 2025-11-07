package level3ex1;

import java.util.HashMap;
import java.util.Map;

public class MapOfPointsPricesForNews {
    private static final Map<String, PointsPricesForNews> mapOfPointsPricesForNews = new HashMap<>();

    public MapOfPointsPricesForNews(){
        mapOfPointsPricesForNews.put(ConstatsKeysNews.FOOTBALL_LEAGUE_CHAMPIONS,new PointsPricesForNews(100,3));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.FOOTBALL_LEAGUE_LALIGA, new PointsPricesForNews(0,2));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.CLUB_FOOT_BCN, new PointsPricesForNews(100,1));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.CLUB_FOOT_MAD, new PointsPricesForNews(100, 1));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.PLAYER_FER, new PointsPricesForNews(50, 1));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.PLAYER_BEN, new PointsPricesForNews(50, 1));

        mapOfPointsPricesForNews.put(ConstatsKeysNews.BASKET_LEAGUE_EURO, new PointsPricesForNews(75 ,5));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.BASKET_LEAGUE_ACB, new PointsPricesForNews(0, 2));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.CLUB_BASKET_BCN, new PointsPricesForNews(75,1));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.CLUB_BASKET_MAD, new PointsPricesForNews(75, 1));

        mapOfPointsPricesForNews.put(ConstatsKeysNews.PLAYER_FEDE, new PointsPricesForNews(100,3));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.PLAYER_NADAL, new PointsPricesForNews(100,3));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.PLAYER_DJO, new PointsPricesForNews(100,3));

        mapOfPointsPricesForNews.put(ConstatsKeysNews.TEAM_FERRARI, new PointsPricesForNews(50 , 1));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.TEAM_MERCEDES, new PointsPricesForNews(100, 1));

        mapOfPointsPricesForNews.put(ConstatsKeysNews.TEAM_HONDA, new PointsPricesForNews(50, 3));
        mapOfPointsPricesForNews.put(ConstatsKeysNews.TEAM_YAMAHA, new PointsPricesForNews(50, 3));
    }

    public double getPriceByKey(String key){
        if (mapOfPointsPricesForNews.containsKey(key))
            return mapOfPointsPricesForNews.get(key).getPrice();
        return 0;
    }

    public double getPointsByKey(String key){
        if (mapOfPointsPricesForNews.containsKey(key))
            return mapOfPointsPricesForNews.get(key).getPoints();
        return 0;
    }
}
