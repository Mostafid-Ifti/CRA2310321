package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MaintenanceRequestController {
}
package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MaintenanceRequestController {

    @FXML
    private Label AcceptanceMessageLabel;

    @FXML
    private Button AssignUpdateTicketButton;

    @FXML
    private ComboBox<String> AssignmentsComboBox;

    @FXML
    private Button CloseButton;

    @FXML
    private TableColumn<?, ?> IdTableColumn;

    @FXML
    private TableColumn<?, ?> LocationTableColumn;

    @FXML
    private Label MaintenanceRequestQueueLabel;

    @FXML
    private ComboBox<?> PrioritiesOptionComboBox;

    @FXML
    private ComboBox<?> ProgressStatusComboBox;

    @FXML
    private TextArea RequestDescriptionTextArea;

    @FXML
    private TableColumn<?, ?> ResidentIdTableColumn;

    @FXML
    private Label ResolutionConfirmLabel;

    @FXML
    private Label SelectedTicketDetiailsLabel;

    @FXML
    private TableColumn<?, ?> StatusTableColumn;

    @FXML
    private TableColumn<?, ?> TypetableColumn;

    @FXML
    private Button UpdateButton;

    @FXML
    private Label VerificationCompleteLabel;

    @FXML
    private TableView<?> requestQueueTableView;

}
