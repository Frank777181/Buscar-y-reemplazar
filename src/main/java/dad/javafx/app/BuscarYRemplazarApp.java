package dad.javafx.app;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazarApp extends Application {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	private CheckBox mayusMinusCheck;
	private CheckBox expresionRegularCheck;
	private CheckBox busquedaAtrasCheck;
	private CheckBox resaltarResuCeck;
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con : ");
		
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		mayusMinusCheck = new CheckBox("Mayúsculas y minúsculas");
		expresionRegularCheck = new CheckBox("Expresión regular");
		busquedaAtrasCheck = new CheckBox("Buscar hacia atrás");
		resaltarResuCeck = new CheckBox("Resaltar resultados");
		
		buscarButton = new Button("Buscar");
		buscarButton.setPrefWidth(100);
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setPrefWidth(100);
		reemplazarTodoButton = new Button("Remplazar todo");
		reemplazarTodoButton.setPrefWidth(100);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setPrefWidth(100);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setPrefWidth(100);
		
		VBox busquedasHBox = new VBox(5,buscarLabel,reemplazarLabel);
		VBox reemplazarHBox = new VBox(5,buscarText,reemplazarText);
		reemplazarHBox.setPrefWidth(200);
		
		VBox primerVBox = new VBox(5,mayusMinusCheck,expresionRegularCheck);
		VBox segundoVBox = new VBox(5,busquedaAtrasCheck,resaltarResuCeck);
		
		VBox botonesVBox = new VBox(5,buscarButton,reemplazarButton,reemplazarTodoButton,cerrarButton,ayudaButton);
		
		HBox checkHBox = new HBox(5,primerVBox,segundoVBox);
		
		VBox textVBox = new VBox(5,reemplazarHBox,checkHBox);
		
		GridPane root = new GridPane();
		
		root.setPadding(new Insets(10));
		root.add(busquedasHBox, 0, 0);
		root.add(textVBox, 1, 0);
		root.add(botonesVBox, 2, 0);
		root.setVgap(20);
		root.setHgap(20);
		
		ColumnConstraints [] cols = {
				
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setHalignment(HPos.CENTER);
		
		root.getColumnConstraints().addAll(cols);
		
		Scene scene = new Scene(root,480,200);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
