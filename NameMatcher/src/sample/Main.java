package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{



        Stage window = new Stage();
        Button button = new Button("click me");


        Label label1 = new Label("Enter your name");
        Label label = new Label("Enter your partner name");
        TextField name1 = new TextField();
        TextField name2 = new TextField();



        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1,name1,label,name2,button);


        button.setOnAction(e->{



            String na1 =name1.getText();
            String na2 = name2.getText();
            int sum = ((na1.length() + na2.length()) * 81) % 100;

            if(na1.equals("sandun") && na2.equals("dileesha")){

                 sum = 99;

                AlertBox.display("Result","You are "+ sum + "% matched");

            }
            else {


                AlertBox.display("Result","You are "+ sum + "% matched");

            }


        });

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Calculate your love");
        window.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
