/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ControLocalidades;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import quimica.Base;
import quimica.Probabilidad;


/**
 * FXML Controller class
 *
 * @author Manual
 */
public class FontibonController implements Initializable {

    @FXML
    private Label promph;

    Base base= new Base();
    Probabilidad p = new Probabilidad(base.sdph("Fontibon"));
    Probabilidad p2 = new Probabilidad (base.sdTZ("Fontibon"));
    @FXML
    private Label promtz;
    @FXML
    private Label nen;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         promph.setText(String.valueOf(p.promedio()));
         promtz.setText(String.valueOf(p2.promedio()));
         nen.setText(String.valueOf(base.cntr("Fontibon")));
    }    

    
}
