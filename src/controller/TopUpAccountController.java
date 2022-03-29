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

public class TopUpAccountController extends Controller<Kiosk> {
    @FXML private TextField IDTf;
    @FXML private TextField amountTf;
    @FXML private Text messageTxt;

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    private int getID() {
        return Integer.parseInt(IDTf.getText());
    }
    
    private int getAmount() {
        return Integer.parseInt(amountTf.getText());
    }
    
    @FXML private void handleTopUp(ActionEvent event) {
        int ID = getID();
        int amount = getAmount();
        Customer customer = model.getCustomer(ID);
        if(customer == null) {
            messageTxt.setText("Customer does not exist.");
            return;
        }
        
        if(amount > 0) {
            model.getCustomer(ID).topUpAccount(amount);
            messageTxt.setText("Transaction Complete.");
        } else {
            messageTxt.setText("Topup amount must be larger than 0.");
        }
        
    }
}
