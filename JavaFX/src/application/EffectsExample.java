package application;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class EffectsExample extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			primaryStage.setTitle("Reflection Effect");
			
			Text text = new Text("Reflection Effect");
			text.setLayoutX(30);
			text.setLayoutY(20);
			text.setTextOrigin(VPos.TOP);
			text.setFont(Font.font("Arial", FontWeight.BOLD, 40));
			
			Reflection reflection = new Reflection();
			reflection.setTopOffset(0);
			reflection.setTopOpacity(0.75); // 투명도
			reflection.setBottomOpacity(0.10);
			reflection.setFraction(0.7); // 그라데이션, 낮으면 안 뜸, 높으면 진하게
			
			text.setEffect(reflection);
			
			Scene scene = new Scene(new Pane(text), 425, 175);
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
