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

public class AddCustomerController extends Controller<Kiosk>{
    
    @FXML private TextField idTf;
    
    @FXML private TextField nameTf;
    
    @FXML private TextField balanceTf;
    
    @FXML private Text addedTxt;
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    private void setID(int idNum) {
        idTf.setText("" + idNum);
    }
    
    public final Kiosk getKiosk() {
        return model;
    }
    
    private int getID() {
        return Integer.parseInt(idTf.getText());
    }
    
    private void setBalance(int balanceNum) {
        balanceTf.setText("" + balanceNum);
    }
    
    private int getBalance() {
        return Integer.parseInt(balanceTf.getText());
    }
    
    
    private String getName() {
        return nameTf.getText();
    }
    
    @FXML private void handleAddCus(ActionEvent event) {
        int ID = getID();
        String name = getName();
        int balance = getBalance();
        Customer customer = getKiosk().getCustomer(ID);
        if(customer != null) {
            addedTxt.setText("That customer is already in the kiosk.");
        } else {
            getKiosk().addCustomer(ID, name, balance);
            addedTxt.setText("Customer added to Kiosk.");
        }
    }

}
