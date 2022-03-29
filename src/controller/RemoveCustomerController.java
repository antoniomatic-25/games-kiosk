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

public class RemoveCustomerController extends Controller<Kiosk>  {
    @FXML private TableView<Customer> removeCustomerTv;
    
    public final Kiosk getKiosk() {
        return model;
    }
    
    private Customer getSelectedCustomer() {
        return removeCustomerTv.getSelectionModel().getSelectedItem();
    }

    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
    @FXML private void handleRemoveCus(ActionEvent event) {
        Customer customer = getSelectedCustomer();
        model.removeCustomer(customer);
    }

}
