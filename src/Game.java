import java.time.LocalDate;
import java.lang.Math;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwPrijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwPrijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        return nieuwPrijs * Math.pow(0.7, java.time.LocalDate.now().getYear() - releaseJaar);
    }

    public boolean equals(Game andereObject){
        if(this.naam == andereObject.getNaam() && this.releaseJaar == andereObject.releaseJaar){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwPrijs + " nu voor: " + huidigeWaarde() + "\n";
    }
}
