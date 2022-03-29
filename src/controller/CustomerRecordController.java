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

public class CustomerRecordController extends Controller<Kiosk> {
    @FXML private TextField IDTf;
    
    @FXML private TableView<Game> rentedGamesTv;
    
    @FXML private TableView<Game> rentingHistoryTv;
    
    @FXML private Text messageTxt;
    @FXML private Button custBtn;
    
    
    private int getID() {
        return Integer.parseInt(IDTf.getText());
    }
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    public final Kiosk getKiosk() {
        return model;
    }
    
    
    @FXML private void handleSelectCus(ActionEvent e) {
        int ID = getID();
        Customer customer = getKiosk().getCustomer(ID);
        if(customer != null) {
            messageTxt.setText(customer.toString());
            rentedGamesTv.setItems(model.getCustomer(ID).currentlyRented());
            rentingHistoryTv.setItems(model.getCustomer(ID).rentingHistory());
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
