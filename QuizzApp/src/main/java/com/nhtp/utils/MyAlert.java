/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhtp.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author HP
 */
public class MyAlert {
    private static MyAlert instance; // Khong goi final vi lat goi
    private final Alert alert;
    private MyAlert(){
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Quizz App");
        
    }
    public static MyAlert getInstance(){
        if(instance == null)
            instance = new MyAlert();
        return instance;
    }
    public void showMsg(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
}
