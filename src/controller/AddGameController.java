package controller;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import au.edu.uts.ap.javafx.*;
import model.Catalogue;

public class AddGameController extends Controller<Catalogue> {
    
    @FXML private TextField titleTf;
    
    @FXML private TextField yearTf;
    
    @FXML private TextField genreTf;
    
    @FXML private TextField priceTf;
    
    @FXML private Text addedTxt;
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Catalogue getCatalogue() {
        return model;
    }
    
    private String getTitle() {
        return titleTf.getText();
    }
    
    private int getYear() {
        return Integer.parseInt(yearTf.getText());
    }
    private int getPrice() {
        return Integer.parseInt(priceTf.getText());
    }
    
    private String getGenreName() {
        return genreTf.getText();
    }
    
    @FXML private void addGame(ActionEvent e) {
        String title = getTitle();
        int year = getYear();
        int price = getPrice();
        String genreName = getGenreName();
        if(model.hasGame(title, year) == true) {
            addedTxt.setText("This game is already in the Catalogue.");
        } else {
            model.addGame(title, year, genreName, price);
            addedTxt.setText("Game added to Catalogue.");
        }
    }
    
}
