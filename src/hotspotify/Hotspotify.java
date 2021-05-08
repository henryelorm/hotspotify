/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotspotify;

import hotspotify.utility.Paths;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Elorm
 */
public class Hotspotify extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource(Paths.interfaceMain));
        //  root.setStyle("-fx-background-color:transparent;");

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        //   stage.setFullScreen(true);
        stage.initStyle(StageStyle.UNIFIED);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
