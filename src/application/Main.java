package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ventanaCedula.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


        /*cedulaController cedulaController = loader.getController();
        cedulaController.setStage(primaryStage);*/
    }

    public static void main(String[] args) {
        launch(args);
    }
    

}
