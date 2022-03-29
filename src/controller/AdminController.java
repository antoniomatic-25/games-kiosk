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

public class AdminController extends Controller<Kiosk> {
    
    @FXML private void handleOpenAddCus(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/AddCustomer.fxml", "Add Customer", new Stage());
    }
    
    @FXML private void handleOpenAddGame(ActionEvent event) throws Exception {
        ViewLoader.showStage(model.getCatalogue(), "/view/AddGame.fxml", "Add Game", new Stage());
    }
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    @FXML private void handleRemoveCus(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/RemoveCustomer.fxml", "Remove Customer", new Stage());
    }
    
    @FXML private void handleRemoveGame(ActionEvent event) throws Exception {
        ViewLoader.showStage(model.getCatalogue(), "/view/RemoveGame.fxml", "Remove Game", new Stage());
    }
    
    @FXML private void handleOpenViewCus(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/ShowAllCustomers.fxml", "Show All Customers", new Stage());
    }
    
    @FXML private void handleOpenViewGames(ActionEvent event) throws Exception {
        ViewLoader.showStage(model.getCatalogue(), "/view/ShowAllGames.fxml", "Show All Games", new Stage());
    }
    
    
}
