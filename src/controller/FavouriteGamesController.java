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

public class FavouriteGamesController extends Controller<Kiosk> {
    @FXML private TableView<Game> favGamesTv;
    @FXML private TextField IDTf;
    @FXML private Text messageTxt;
    @FXML private Button custBtn;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    private int getID() {
        return Integer.parseInt(IDTf.getText());
    }
    
    public final Kiosk getKiosk() {
        return model;
    }
    
    @FXML private void handleSelectCus(ActionEvent e) {
        int ID = getID();
        Customer customer = getKiosk().getCustomer(ID);
        if(customer != null) {
            messageTxt.setText(customer.toString());
            favGamesTv.setItems(model.getCustomer(ID).favouriteGames());
        } else {
            messageTxt.setText("This customer doesn't exist");
        }
    }
    
    @FXML private void initialize() {
        IDTf.textProperty().addListener((o, oldText, newText) -> { 
            custBtn.setDisable(!newText.matches("[0123456789]+"));
        });
    }
    
}
