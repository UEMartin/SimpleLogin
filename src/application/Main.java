package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		this.stage=primaryStage;
        mainWindow();
	}
	
	private void mainWindow() {
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Login.fxml"));
			//BorderPane root = new BorderPane();
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.setTitle("Welcome!");
			stage.setScene(scene);
			stage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}//try
	}//mainWindow()

	public static void main(String[] args) {
		launch(args);
	}
}
