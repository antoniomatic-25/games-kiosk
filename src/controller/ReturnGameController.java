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

public class ReturnGameController extends Controller<Catalogue> {
    @FXML private TableView<Game> returnGamesTv;
    @FXML private TextField IDTf;
    @FXML private Text messageTxt;
    @FXML private Button returnBtn;
    @FXML private Button custBtn;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    private int getID() {
        return Integer.parseInt(IDTf.getText());
    }
    
    private Game getSelectedGame() {
        return returnGamesTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleShowGames(ActionEvent e) {
        int ID = getID();
        returnGamesTv.setItems(model.getKiosk().getCustomer(ID).currentlyRented());
    }
    
    @FXML private void handleReturnGame(ActionEvent e) {
        Game game = getSelectedGame();
        int ID = getID();
        Customer customer = model.getCustomer(ID);
        model.returnGameFromCustomer(game, customer);
        messageTxt.setText("Game Returned.");
    }
    
    @FXML private void initialize() {
        returnGamesTv.getSelectionModel().selectedItemProperty().addListener(
        (o, oldGame, newGame) -> returnBtn.setDisable(getSelectedGame() == null));
        
        IDTf.textProperty().addListener((o, oldText, newText) -> { 
            custBtn.setDisable(!newText.matches("[0123456789]+"));
        });
        
    }
    
}
