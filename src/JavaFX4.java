import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFX4 extends Application {

    Stage window1;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;
        window1.setTitle("Message");

        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(8);
        grid1.setHgap(10);

        //Username label
        Label user1 = new Label("Username");
        GridPane.setConstraints(user1, 0, 0);

        //user input
        TextField name1 = new TextField("Sell");
        GridPane.setConstraints(name1,1,0);

        //Password label
        Label pass1 = new Label("Password");
        GridPane.setConstraints(pass1, 0, 1);

        //Password input
        TextField passIn1 = new TextField();
        passIn1.setPromptText("Enter Password");
        GridPane.setConstraints(passIn1, 1, 1);

        //Age Label
        Label age1 = new Label("Age");
        GridPane.setConstraints(age1, 0, 2);

        //Age input
        TextField ageIn1 = new TextField();
        ageIn1.setPromptText("Enter your age");
        GridPane.setConstraints(ageIn1, 1, 2);

        Button login1 = new Button("Login");
        login1.setOnAction(e-> isInt(ageIn1, ageIn1.getText()));
        GridPane.setConstraints(login1, 1, 4);

        grid1.getChildren().addAll(name1, user1, pass1, passIn1, login1, age1, ageIn1);

        Scene scene1 = new Scene(grid1, 500, 500);
        window1.setScene(scene1);
        window1.show();




    }

    private boolean isInt(TextField input1, String message) {
        try{
            int age = Integer.parseInt(input1.getText());
            System.out.println("User is " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error " + message + " is not a number");
            return false;
        }
    }

}
