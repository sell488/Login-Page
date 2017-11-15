import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX4 extends Application {

    Button button1;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test4");

        button1 = new Button("Test 2.4");

        button1.setOnAction(e -> {
            System.out.println("Hi");
            System.out.println("HELLO");
        });

        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);

        Scene scene1 = new Scene(layout1, 300, 250);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

}
