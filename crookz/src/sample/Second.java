package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.awt.*;

public class Second extends Application {

    private Stage window;
    public Scene scene1;
    public  Scene scene2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        Label label1 = new Label("Hello welcome scene1 ");
        Button button1 = new Button("Click me go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200);

        //button 2
//        Label label1 = new Label("Hello welcome scene1 ");
        Button button2 = new Button("Click me go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //layout 2

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2  = new Scene(layout2,300,600);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();

    }


}
