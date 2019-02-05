package view;

import backend.BagCollege;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application{
	private static BagCollege college;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		college = new BagCollege();
		BorderPane pane = new MenuPane().getMenuPane();
		
		Scene aScene = new Scene (pane, 500, 300);
		primaryStage.setScene(aScene);
		primaryStage.show();
	}

	public static BagCollege getCollege() {
		return college;
	}

	public void setCollege(BagCollege college) {
		this.college = college;
	}
}
