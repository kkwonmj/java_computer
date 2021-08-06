package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class AccordionExample extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			Accordion accordion = new Accordion();
			
			TitledPane pane1 = new TitledPane("Boats", new Label("Show all boats available"));
			TitledPane pane2 = new TitledPane("cars", new Label("Show all cars available"));
			TitledPane pane3 = new TitledPane("Planes", new Label("Show all Planes available"));
			
			accordion.getPanes().add(pane1);
			accordion.getPanes().add(pane2);
			accordion.getPanes().add(pane3);
			
			HBox hBox = new HBox(accordion);
			Scene svene = new Scene(hBox, 400, 200);
			
			primaryStage.setScene(svene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
