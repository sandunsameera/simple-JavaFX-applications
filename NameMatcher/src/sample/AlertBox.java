package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

//import java.awt.*;

public class AlertBox {

    public static void display(String Title, String Message){

        Stage widow = new Stage();
        widow.initModality(Modality.APPLICATION_MODAL);
        widow.setTitle(Title);
        widow.setMaxWidth(250);

        Label label = new Label();
        label.setText(Message);

        Button button = new Button("Cancel");
        button.setOnAction(e-> widow.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);

        widow.setScene(scene);
        widow.showAndWait();




    }
}
