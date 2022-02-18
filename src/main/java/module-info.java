module com.test.multi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.test.multi to javafx.fxml;
    exports com.test.multi;
}
