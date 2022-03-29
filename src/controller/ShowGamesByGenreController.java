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

public class ShowGamesByGenreController extends Controller<Catalogue> {
    @FXML private ListView<Genre> genresLv;
    
    @FXML private TableView<Game> gamesGenreTv;
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Catalogue getCatalogue() {
        return model;
    }
    
    private Genre getSelectedGenre() {
        return genresLv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleDisplayGames(ActionEvent event) {
        Genre genre = getSelectedGenre();
        gamesGenreTv.setItems(model.getGamesInGenre(genre));
    }

}
