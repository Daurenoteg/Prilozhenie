package kz.daurenad;
import java.io.Serializable;
public class Device implements Serializable  {
    private String name;
    private String cost;
    private String game;
    private String developer;
    private String year;

    public Device() {
    }

    public Device(String name, String cost, String game, String developer,String year) {

        this.name = name;
        this.cost = cost;
        this.game = game;
        this.developer = developer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString(){
        return name+" "+cost+" "+game+" "+developer+" "+year;
    }
}
