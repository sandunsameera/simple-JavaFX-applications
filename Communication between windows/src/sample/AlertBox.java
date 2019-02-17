package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String Title,String Message){
        Button button;
        Stage window;

        window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        button = new Button("Close");
        Label label = new Label(Message);

        button.setOnAction(e->window.close());
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,button);

        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle(Title);
        window.showAndWait();
    }
}
