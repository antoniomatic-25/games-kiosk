package model;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.*;

public class Game {

    private final String title;
    private final IntegerProperty year = new SimpleIntegerProperty();
    private final int price;  
    private final Genre genre;

    public Game(String title, int year, Genre genre, int price) {
        this.title = title;
        this.genre = genre;
        //this.year = year;
        this.year.set(year);
        this.price = price;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public int getPrice() {
        return this.price;
    }
    
    public int getYear() {
        //return this.year;
        return year.get();
    }
    
    public final IntegerProperty yearProperty() {
        return year;
    }
    
    public String getTitle() {
        return this.title;
    }

    public boolean titleMatches(String title) {

        return this.title.equals(title);
    }
    
    public boolean yearMatches(int year) {

        return getYear() == year;
    }

    @Override
    public String toString() {
        return this.year+"\t"+this.title + "\t" +this.genre.toString() + "\t$" + this.price;
    }

}
