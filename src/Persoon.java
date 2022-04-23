import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game g){
        if(g.huidigeWaarde() <= budget) {
            for (Game game : games) {
                if (game.equals(g)) {
                    return false;
                }
            }
            games.add(g);
            budget = budget - g.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        for (Game game : games) {
            if (game.equals(g)) {
                if(koper.koop(g)){
                    games.remove(game);
                    budget = budget + g.huidigeWaarde();
                    return true;
                }

            }
        }
        return false;
    }



    public String toString(){
        String library = "";
        for(Game game : games){
            library += game.toString() + "\n";
        }


        return naam + "heeft een budget van " + budget + " en bezit de volgende games: \n" + library;
    }
}
