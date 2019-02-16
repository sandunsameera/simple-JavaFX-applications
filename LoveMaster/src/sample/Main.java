package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

//import java.awt.*;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
       Stage window = new Stage();
       Label label = new Label("Enter your name");
        Label label1 = new Label("Enter your partner name");
        Button button1 = new Button("Calculate");
        TextField yourname = new TextField();

        TextField partnername= new TextField();

            String name1 = yourname.getText();
            String name2 = partnername.getText();

            int sum = ((name1.length() + name2.length())*81)%100;
            System.out.println(sum);


            button1.setOnAction(e -> AlertBox.display("Result","The percentage is "+sum+"%"));

       VBox layout = new VBox(20);
       layout.getChildren().addAll(label,yourname,label1,partnername,button1);
       Scene scene = new Scene(layout);
       window.setScene(scene);
       window.setTitle("Love Calculator");
       window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
