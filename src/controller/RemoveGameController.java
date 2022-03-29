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

public class RemoveGameController extends Controller<Catalogue> {
    @FXML private TableView<Game> removeGameTv;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Catalogue getCatalogue() {
        return model;
    }
    
    private Game getSelectedGame() {
        return removeGameTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleRemoveGame(ActionEvent event) {
        Game game = getSelectedGame();
        model.removeGame(game);
    }

}
