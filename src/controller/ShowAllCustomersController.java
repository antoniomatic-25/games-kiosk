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

public class ShowAllCustomersController extends Controller<Kiosk> {
    @FXML private TableView<Game> allCustomersTv;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Kiosk getKiosk() {
        return model;
    }

}
