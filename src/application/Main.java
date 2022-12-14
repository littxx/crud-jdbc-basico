package application;

import java.awt.ScrollPane;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View.fxml"));
			javafx.scene.control.ScrollPane scrollpane = loader.load();
			
			scrollpane.setFitToHeight(true);
			scrollpane.setFitToWidth(true);
			Scene mainScene = new Scene(scrollpane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Tabela Funcionarios");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
