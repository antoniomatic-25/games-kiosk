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

public class CatalogueController extends Controller<Catalogue> {

    public final Catalogue getCatalogue() { return model; }
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    @FXML private void handleOpenAllGames(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ShowAllGames.fxml", "All Games", new Stage());
    }
    
    @FXML private void handleOpenAvaGames(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ShowAvailableGames.fxml", "Available Games", new Stage());
    }
    
    @FXML private void handleOpenGamesGenre(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ShowGamesByGenre.fxml", "Games by Genre", new Stage());
    }
    
    @FXML private void handleOpenGamesYear(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ShowGamesByYear.fxml", "Games by Year", new Stage());
    }
    
    @FXML private void handleOpenRentGame(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/RentGame.fxml", "Rent a Game", new Stage());
    }
    
    @FXML private void handleOpenReturnGame(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ReturnGame.fxml", "Return a Game", new Stage());
    }
}
