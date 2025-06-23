/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nhtp.quizzapp.quizzapp;

import com.nhtp.pojo.Category;
import com.nhtp.services.CategoryServices;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class QuestionController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    private static final CategoryServices cateService = new CategoryServices();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
//            // B1
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            // B2
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizzdb", "root", "0938775811tanphuc");
//            // B3
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM category");
//            List<Category> cates = new ArrayList<>();
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Category c = new Category(rs.getInt("id"), rs.getString("name"));
//                cates.add(c);
//                
//                System.out.printf("%d - %s\n", id, name);
//            }
//            // B4
//            conn.close();

            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
        } catch (/*ClassNotFoundException |*/SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
