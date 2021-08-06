package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenubarExample extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			primaryStage.setTitle("JavaFX App");
			
			Menu menu = new Menu("Menu 1");
			MenuItem menuItem1 = new MenuItem("Item1");
			MenuItem menuItem2 = new MenuItem("Item2");

			menu.getItems().add(menuItem1);
			menu.getItems().add(menuItem2);
			
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().add(menu);

			VBox vBox = new VBox(menuBar);
			Scene scene = new Scene(vBox, 960, 600);
			
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
