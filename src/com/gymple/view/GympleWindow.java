/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gymple.view;

import com.gymple.controller.GymDisplayController;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GympleWindow extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("/com/gymple/controller/Menu.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Gymple");
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.show();
            
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
