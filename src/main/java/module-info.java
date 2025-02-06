module com.example.ex1_chap2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_chap2 to javafx.fxml;
    exports com.example.ex1_chap2;
}