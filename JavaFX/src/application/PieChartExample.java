package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class PieChartExample extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			primaryStage.setTitle("PieChart");
			
			PieChart pieChart = new PieChart();
			PieChart.Data slice1 = new PieChart.Data("Desktop", 13); // 적힌 값
			PieChart.Data slice2 = new PieChart.Data("Phone", 80);
			PieChart.Data slice3 = new PieChart.Data("Tablet", 7);
			
			pieChart.getData().add(slice1);
			pieChart.getData().add(slice2);
			pieChart.getData().add(slice3);
			
			VBox vbox = new VBox(pieChart);
			
			Scene scene = new Scene(vbox, 500, 300);
			
			primaryStage.setScene(scene);
			primaryStage.setHeight(300);
			primaryStage.setWidth(600);
			
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
