package com.nhtp.quizzapp.quizzapp;

import com.nhtp.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {
    // 
    public void handleQuestionManagement(ActionEvent event) throws IOException{
//        Alert alert = new Alert(Alert.AlertType.INFORMATION); // Ex: Vao quan ly cau hoi no se show ra thong tin alert box
//        alert.setHeaderText("Quizz App");
//        alert.setContentText("QuestionManagement: Coming soon...");
//        alert.showAndWait(); // co 2 cach show show() backgroud van chay duoc con showAndWait() la khoa lun chung nao co thang handleQuestionManagement moi chay duoc
//        MyAlert.getInstance().showMsg("QuestionManagement: Coming soon...");
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quizz App");
        stage.show();
    }
    public void handlePractice(ActionEvent event){
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quizz App");
//        alert.setContentText("Practice: Coming soon...");
//        alert.showAndWait();
        MyAlert.getInstance().showMsg("Practice: Coming soon...");
    }
    public void handleExam(ActionEvent event){
        MyAlert.getInstance().showMsg("Exam: Coming soon...");
    }
}
