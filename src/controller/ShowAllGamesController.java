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

public class ShowAllGamesController extends Controller<Catalogue> {
    @FXML private TableView<Game> allGamesTv;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Catalogue getCatalogue() {
        return model;
    }
    
}
