package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class User3G5 {
}
package com.example.cra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class User3G5Controller {

    @FXML
    private Label DashboardLabel;

    @FXML
    private TableColumn<?, ?> EquipmentIdTableColumn;

    @FXML
    private Label Reminderlabel;

    @FXML
    private Button SaveScehdulebutton;

    @FXML
    private TableColumn<?, ?> SensorReadingtableColumn;

    @FXML
    private Button ShceduleMaintainButton;

    @FXML
    private TableColumn<?, ?> StatustableColumn;

    @FXML
    private DatePicker dpdateDatepicker;

    @FXML
    private TableView<?> equipmentTableView;

    @FXML
    void handlesaveSchedule(ActionEvent event) {

    }

    @FXML
    void handleshcedulemaintain(ActionEvent event) {

    }

}
