package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class User4G4 {
}
package com.example.cra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class User4G4Controller {

    @FXML
    private TableColumn<?, ?> AmountTableColumn;

    @FXML
    private TableView<String> BillTableView;

    @FXML
    private Button Breakdownbutton;

    @FXML
    private TableColumn<?, ?> DueTableColumn;

    @FXML
    private Button MyBillButton;

    @FXML
    private Button PaymentButton;

    @FXML
    private Label PaymentStatusLabel;

    @FXML
    private TableColumn<?, ?> StatusTableColumn;

    @FXML
    private ListView<?> paymentListView;

    @FXML
    void handleMyBill(ActionEvent event) {

    }

    @FXML
    void handlebreakdown(ActionEvent event) {

    }

    @FXML
    void handlepayment(ActionEvent event) {

    }

}
