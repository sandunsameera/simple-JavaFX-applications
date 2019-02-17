package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.control.Button;

public class ConfirmBox {
    static boolean answer;

    public static boolean display(String Title,String Message){

        Stage window = new Stage();
        Button yesButton,noButton;
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(Title);
        Label label = new Label(Message);

        yesButton = new Button("Yes");
        noButton = new Button("No");

        yesButton.setOnAction(e->{
            answer = true;
            window.close();
        });

        noButton.setOnAction(e->{
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,yesButton,noButton);
        Scene scene = new Scene(layout);
        layout.setAlignment(Pos.CENTER);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
