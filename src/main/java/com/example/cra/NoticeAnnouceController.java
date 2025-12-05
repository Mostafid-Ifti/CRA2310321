package com.example.cra;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class NoticeAnnouceController {
}
package com.example.cra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class NoticeAnnounceController {

    @FXML
    private Button AnnouncementButton;

    @FXML
    private TableColumn<?, ?> DateTableColumn;

    @FXML
    private TextArea FullNoticeContentTextArea;

    @FXML
    private Button MarkAsReadButton;

    @FXML
    private TableView<?> NoticeListTableView;

    @FXML
    private Label NoticeTitleLabel;

    @FXML
    private TableColumn<?, ?> StatustableColumn;

    @FXML
    private TableColumn<?, ?> TitleTableColumn;

    @FXML
    void openNoticesScene(ActionEvent event) {

    }

}
