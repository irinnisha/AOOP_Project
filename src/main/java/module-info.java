module com.example.aoopproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aoopproject to javafx.fxml;
    exports com.example.aoopproject;

    opens LabourHiring to javafx.fxml;
    exports LabourHiring;
}