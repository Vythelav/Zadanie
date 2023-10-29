module com.example.democon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.democon to javafx.fxml;
    exports com.example.democon;
}