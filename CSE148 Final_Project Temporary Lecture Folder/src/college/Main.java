package college;

import college.view.RootPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	private Stage primaryStage;
	private Pane rootPane;

	@Override
	public void start(Stage primaryStage) {
		try {
			//College college = new College();
			buildRootPane();
			this.primaryStage = primaryStage;
			Scene scene = new Scene(rootPane, 800, 500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void buildRootPane() {
		this.rootPane = new RootPane().getRootPane();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
