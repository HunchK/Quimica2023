
package quimica;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    try{
        //Base base = new Base();
        //Probabilidad p = new Probabilidad(base.sdph("Engativa"));
        //System.out.println("El promedio de los datos de Engtiva es: " + p.promedio());
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("MapaPrincipal.fxml"));
        Pane ventana= (Pane)loader.load();
        
        Scene scene = new Scene(ventana);
        primaryStage.setTitle("Medida de aguas");
        primaryStage.setScene(scene);
        primaryStage.show();
      } catch (IOException e){
          
          System.out.println(e.getMessage());
      }
    
    
    }
    
    public static void main(String[] args){
        launch(args); 
        
        
    }
    
    
}
