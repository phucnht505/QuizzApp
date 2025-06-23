/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhtp.services;

import com.nhtp.pojo.Category;
import com.nhtp.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CategoryServices {
    public List<Category> getCates() throws SQLException{
        Connection conn = JdbcConnector.getInstance().connect();
        // B3
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
            List<Category> cates = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Category c = new Category(rs.getInt("id"), rs.getString("name"));
                cates.add(c);
                
                System.out.printf("%d - %s\n", id, name);
            }
            return cates;
    }
}
