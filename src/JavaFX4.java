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
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;

        Label label1 = new Label("Welcome");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction((e -> window1.setScene(scene2)));

        //First layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 400, 200);

        StackPane layout2 = new StackPane();
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window1.setScene(scene1));
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 400, 200);

        window1.setScene(scene1);
        window1.setTitle("Scene1");
        window1.show();


    }

}
