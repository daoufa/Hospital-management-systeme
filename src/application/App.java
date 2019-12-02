package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class App extends Application { 
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("Style/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
