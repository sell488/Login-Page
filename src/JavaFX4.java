import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX4 extends Application {

    Stage window1;
    Button button1;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;
        window1.setTitle("Message");

        button1 = new Button("Click");
        button1.setOnAction(e -> AlertBox.display("Title", "Wow"));

        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        Scene scene1 = new Scene(layout1, 300, 250);
        window1.setScene(scene1);
        window1.show();



    }

}
