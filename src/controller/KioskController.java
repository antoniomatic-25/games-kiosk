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

public class KioskController extends Controller<Kiosk> {

  @FXML
  public void initialize() {

  }

  public final Kiosk getKiosk() {
        return model;
    }
  
  @FXML private void handleOpen(ActionEvent event) throws Exception {
        ViewLoader.showStage(model.getCatalogue(), "/view/Catalogue.fxml", "Catalogue", new Stage());
    }
  
  @FXML private void handleOpen1(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/Admin.fxml", "Administration Menu", new Stage());
    }
  
  @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
  
  @FXML private void handleOpenTopUp(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/TopUpAccount.fxml", "Account Top-up", new Stage());
    }
  
  @FXML private void handleOpenRecord(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/CustomerRecord.fxml", "Customer Record", new Stage());
    }
  
  @FXML private void handleOpenFavourites(ActionEvent event) throws Exception {
        ViewLoader.showStage(model, "/view/FavouriteGames.fxml", "Favourites", new Stage());
    }

}
