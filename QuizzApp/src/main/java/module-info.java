module com.nhtp.quizzapp.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;

    opens com.nhtp.quizzapp.quizzapp to javafx.fxml;
    exports com.nhtp.quizzapp.quizzapp;
}
