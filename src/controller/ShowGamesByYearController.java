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
import model.*;

public class ShowGamesByYearController extends Controller<Catalogue> {
    @FXML private ListView<IntegerProperty> yearsLv;
    
    @FXML private TableView<Game> gamesYearTv;
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Catalogue getCatalogue() {
        return model;
    }
    
    private IntegerProperty getSelectedYear() {
        return yearsLv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleDisplayGames(ActionEvent event) {
        IntegerProperty year = getSelectedYear();
        //int actualYear = year.getYear();
        gamesYearTv.setItems(model.getGamesByYear(year));
    }
    
    @FXML private void initialize() {
        yearsLv.setItems(model.getYears());
    }
    
}
