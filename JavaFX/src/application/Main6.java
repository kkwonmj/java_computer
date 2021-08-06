package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;


public class Main6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			primaryStage.setTitle("JavaFX App");
			
			DirectoryChooser directoryChooser = new DirectoryChooser();
			directoryChooser.setInitialDirectory(new File("src"));
			
			Button button = new Button("Selected Directory");
			button.setOnAction(e -> { // 객체 상속이 필요 없음 (바로 쓸 수는 없어서 람다식)
				File selectedDirectory = directoryChooser.showDialog(primaryStage);
				
				System.out.println(selectedDirectory.getAbsolutePath());
			});
			

			VBox vBox = new VBox(button);
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
