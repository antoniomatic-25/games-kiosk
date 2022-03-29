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

public class RentGameController extends Controller<Catalogue> {
    @FXML private TableView<Game> rentGamesTv;
    @FXML private TextField IDTf;
    @FXML private Text messageTxt;
    @FXML private Button custBtn;
    @FXML private Button rentBtn;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    private final int getID() {
        return Integer.parseInt(IDTf.getText());
    }
    

    
    private Game getSelectedGame() {
        return rentGamesTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleShowGames(ActionEvent e) {
        if(model.getCustomer(getID()) != null) {
            rentGamesTv.setItems(model.getAvailableGames());
        } else {
            messageTxt.setText("Customer does not exist.");
        }
    }
    
    @FXML private void handleRentGame(ActionEvent e) {
        int ID = getID();
        Customer customer = model.getCustomer(ID);
        Game game = getSelectedGame();
        model.rentGameToCustomer(game, customer);
        messageTxt.setText("Game Rented.");
    }
    
    @FXML private void initialize() {
        rentGamesTv.getSelectionModel().selectedItemProperty().addListener(
        (o, oldGame, newGame) -> rentBtn.setDisable(getSelectedGame() == null));
        
        IDTf.textProperty().addListener((o, oldText, newText) -> { 
            custBtn.setDisable(!newText.matches("[0123456789]+"));
        });
    }
}
