
package ControLocalidades;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import quimica.Base;
import quimica.Probabilidad;

public class UsaquenController implements Initializable {

    @FXML
    private Label promph;
    @FXML
    private Label promtz;
    @FXML
    private Label nen;
    private static String Loc = "Usaquen";
    Base base= new Base();
    Probabilidad p = new Probabilidad(base.sdph(Loc));
    Probabilidad p2 = new Probabilidad (base.sdTZ(Loc));

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         promph.setText(String.valueOf(p.promedio()));
         promtz.setText(String.valueOf(p2.promedio()));
         nen.setText(String.valueOf(base.cntr(Loc)));
    }    

    
}
