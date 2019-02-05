package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static BodyBag bodybag = new BodyBag();
	public static BookBag bookbag = new BookBag();
	public static MasterCourseBag mastercoursebag = new MasterCourseBag();
	@Override
	public void start(Stage primaryStage){
		MainBorderPane mainBorderPane = new MainBorderPane();
		Scene scene = new Scene(mainBorderPane);
		
		primaryStage.setTitle("Suffolk County Community College");
		bookbag.load();
		bodybag.load();
		mastercoursebag.load();
		
		setUserAgentStylesheet(STYLESHEET_CASPIAN);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
		
		primaryStage.setOnCloseRequest(event ->{
			bookbag.update();
			bodybag.update();
			mastercoursebag.update();
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
