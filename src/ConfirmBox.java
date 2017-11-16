/**
 * Created by sell4_8aha on 11/15/2017.
 */
/**
 * Created by sell4_8aha on 11/15/2017.
 */
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    static boolean answer1;

    public static boolean display(String title, String message) {
        Stage window1 = new Stage();

        window1.initModality(Modality.APPLICATION_MODAL);
        window1.setTitle(title);
        window1.setMinWidth(250);

        Label label1 = new Label(message);

        Button yesButton1 = new Button("Yes");
        Button noButton1 = new Button("No");

        yesButton1.setOnAction(e-> {
           answer1 = true;
           window1.close();
        });

        noButton1.setOnAction(e-> {
           answer1 = false;
           window1.close();
        });

        Button button2 = new Button("Close");
        button2.setOnAction(e -> window1.close());
        VBox layout1 = new VBox(10);
        layout1.getChildren().addAll(label1, yesButton1, noButton1);
        layout1.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout1);
        window1.setScene(scene1);
        window1.showAndWait();

        return answer1;

    }
}