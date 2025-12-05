module com.example.cra {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cra to javafx.fxml;
    exports com.example.cra;
}