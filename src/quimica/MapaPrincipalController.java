
package quimica;

import ControLocalidades.AntonioNarinoController;
import ControLocalidades.BarriosUnidosController;
import ControLocalidades.BosaController;
import ControLocalidades.ChapineroController;
import ControLocalidades.CiudadBolivarController;
import ControLocalidades.EngativaController;
import ControLocalidades.FontibonController;
import ControLocalidades.KennedyController;
import ControLocalidades.LacandelariaController;
import ControLocalidades.MartiresController;
import ControLocalidades.PuenteArandaController;
import ControLocalidades.RafaelUrController;
import ControLocalidades.SanCristobalController;
import ControLocalidades.SantaFeController;
import ControLocalidades.SubaController;
import ControLocalidades.SumapazController;
import ControLocalidades.TeusaquilloController;
import ControLocalidades.TunjuelitoController;
import ControLocalidades.UsaquenController;
import ControLocalidades.UsmeController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Manual
 */
public class MapaPrincipalController implements Initializable {

    @FXML
    private TabPane MAPAprincipal;
    @FXML
    private Button btnUsa;
    @FXML
    private Button BtnSuba;
    @FXML
    private Button btnEng;
    @FXML
    private Button btnBU;
    @FXML
    private Button btnChap;
    @FXML
    private Button btnKen;
    @FXML
    private Button btnPA;
    @FXML
    private Button btnBosa;
    @FXML
    private Button btnMart;
    @FXML
    private Button btnSF;
    @FXML
    private Button btnTeu;
    @FXML
    private Button btnFont;
    @FXML
    private Button btnCB;
    @FXML
    private Button btnTun;
    @FXML
    private Button btnRU;
    @FXML
    private Button btnAN;
    @FXML
    private Button btnSC;
    @FXML
    private Button btnUsme;
    @FXML
    private Button btnSp;
    @FXML
    private Button btnCande;
    @FXML
    private StackedBarChart<String,Number> tabReg;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Base base = new Base();

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>("Semana 1", 6.99));
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 2", 5.899));
        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 3", 5.6));
        XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 4", 6.5));
        XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 5", 7.6));
        XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 6", 7.1));
        XYChart.Series<String, Number> series7 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 7", 7.8));
        XYChart.Series<String, Number> series8 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 8", 7.9));
        XYChart.Series<String, Number> series9 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 9", 7.7));
        XYChart.Series<String, Number> series10 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 10", 7.7));
        XYChart.Series<String, Number> series11 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 11", 6.6));
        XYChart.Series<String, Number> series12 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 12", 7.923));
        XYChart.Series<String, Number> series13 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 13", 7.985));
        XYChart.Series<String, Number> series14 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Semana 14", 8.059));
        
        
        tabReg.getData().clear();
        tabReg.getData().addAll(series1,series2,series3,series4,series5,series6,series7,series8
                                ,series9,series10,series11,series12,series13,series14);
        
        
        
    }   

    @FXML
    private void dUsa(ActionEvent event) {
        try {
            System.out.println("Usaquen");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/usaquen.fxml"));
            
            Parent root = loader.load();
            
            UsaquenController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dtllSuba(ActionEvent event) {
            try {
            System.out.println("Suba");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Suba.fxml"));
            
            Parent root = loader.load();
            
           SubaController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    @FXML
    private void dEng(ActionEvent event) {
          try {
            System.out.println("Engativa");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Engativa.fxml"));
            
            Parent root = loader.load();
            
            EngativaController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    @FXML
    private void dBU(ActionEvent event) {
       try {
            System.out.println("Barrios Unidos");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/BU.fxml"));
            
            Parent root = loader.load();
            
            BarriosUnidosController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dChap(ActionEvent event) {
          try {
            System.out.println("Chapinero");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Capinero.fxml"));
            
            Parent root = loader.load();
            
            ChapineroController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    @FXML
    private void dKen(ActionEvent event) {
            try {
            System.out.println("Kennedy");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Kennedy.fxml"));
            
            Parent root = loader.load();
            
            KennedyController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dPA(ActionEvent event) {
            try {
            System.out.println("Puente Aranda");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/PuenteAranda.fxml"));
            
            Parent root = loader.load();
            
            PuenteArandaController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dBosa(ActionEvent event) {
            try {
            System.out.println("Bosa");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Bosa.fxml"));
            
            Parent root = loader.load();
            
            BosaController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dMart(ActionEvent event) {
            try {
            System.out.println("Martires");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Martires.fxml"));
            
            Parent root = loader.load();
            
            MartiresController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dSF(ActionEvent event) {
            try {
            System.out.println("Santa Fe");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/SantaFe.fxml"));
            
            Parent root = loader.load();
            
            SantaFeController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dTeu(ActionEvent event) {
        try {
            System.out.println("Teusaquillo");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Teusaquillo.fxml"));
            
            Parent root = loader.load();
            
            TeusaquilloController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dFont(ActionEvent event) {
        try {
            System.out.println("Fontibon");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Fontibon.fxml"));
            
            Parent root = loader.load();
            
            FontibonController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dCB(ActionEvent event) {
        try {
            System.out.println("Ciudad Bolivar");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/CiudadBolivar.fxml"));
            
            Parent root = loader.load();
            
            CiudadBolivarController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dTun(ActionEvent event) {
        try {
            System.out.println("Tunjuelito");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Tunjuelito.fxml"));
            
            Parent root = loader.load();
            
            TunjuelitoController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dRu(ActionEvent event) {
        try {
            System.out.println("Rafael Uribe");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/RafaelUr.fxml"));
            
            Parent root = loader.load();
            
           RafaelUrController controlador = loader.getController();
             
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dAN(ActionEvent event) {
        try {
            System.out.println("Antonio Nariño");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/AntonioNarino.fxml"));
            
            Parent root = loader.load();
            
            AntonioNarinoController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dSC(ActionEvent event) {
        try {
            System.out.println("San Cristobal");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/SanCristobal.fxml"));
            
            Parent root = loader.load();
            
            SanCristobalController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dUsme(ActionEvent event) {
        try {
            System.out.println("Usme");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Usme.fxml"));
            
            Parent root = loader.load();
            
            UsmeController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dSp(ActionEvent event) {
            try {
            System.out.println("Sumapaz");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Sumapaz.fxml"));
            
            Parent root = loader.load();
            
            SumapazController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void dCande(ActionEvent event) {
            try {
            System.out.println("Candelaria");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Localidades/Lacandelaria.fxml"));
            
            Parent root = loader.load();
            
            LacandelariaController controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MapaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
