package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.text.html.ImageView;
import java.awt.event.ActionEvent;

public class UpdateReportController {
}
package com.example.cra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class UpdateReportController {

    @FXML
    private TableColumn<?, ?> DETAILSTableColumn;

    @FXML
    private Button EventUpdateButton;

    @FXML
    private Button FinalUpdateButton;

    @FXML
    private TableColumn<?, ?> LOCATIONTableColumn;

    @FXML
    private TextField LocationTextField;

    @FXML
    private TextField LoginIDTextField;

    @FXML
    private TableColumn<?, ?> MEDIATableColumn;

    @FXML
    private Label MaintenanceOfficerLabel;

    @FXML
    private ImageView MediaImageView;

    @FXML
    private TextField NotesInputTextField;

    @FXML
    private Label NotificationConfirmLabel;

    @FXML
    private TextArea REPORTPREVIEWTextArea;

    @FXML
    private TableView<?> SecurityLogTabelView;

    @FXML
    private ChoiceBox<?> SelectClassificationsChoiceBox;

    @FXML
    private TableColumn<?, ?> TIMESTAMPTableColumn;

    @FXML
    private Label VerificationStatusLabel;

    @FXML
    void handleEventUpdate(ActionEvent event) {

    }

    @FXML
    void handleFinalUpdate(ActionEvent event) {

    }

    @FXML
    void handleNotesInput(ActionEvent event) {

    }

}
