/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotspotify.controller;

import hotspotify.utility.Paths;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Elorm
 */
public class InterfaceController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button startButton;

    @FXML
    private Button stopButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            System.out.println("Start");

            String[] command = {"cmd.exe", "/C", "Start", "C:\\start.bat"};
            Process p = Runtime.getRuntime().exec(command);

        } catch (IOException ex) {
        }

    }

    @FXML
    void startButtonInit(ActionEvent event) throws IOException, InterruptedException {

        try {
            System.out.println("Start");

            String[] command = {"cmd.exe", "/C", "Start", "C:\\start.bat"};
            Process p = Runtime.getRuntime().exec(command);

        } catch (IOException ex) {
        }

    }

    @FXML
    void stopButtonInit(ActionEvent event) {

        try {
            System.out.println("Stop");

            String[] command = {"cmd.exe", "/C", "Start", "C:\\stop.bat"};
            Process p = Runtime.getRuntime().exec(command);

        } catch (IOException ex) {
        }

    }

}
