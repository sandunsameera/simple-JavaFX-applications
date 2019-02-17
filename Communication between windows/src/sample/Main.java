package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicButtonUI;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window;
        Button button;

        window = primaryStage;
        window.setTitle("This is the title");
        button = new Button("Click me");

        button.setOnAction(e->{
            boolean reult =ConfirmBox.display("ConfirmBox","Are you sure");
            System.out.println(reult);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,200,200);
        window.setScene(scene);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
