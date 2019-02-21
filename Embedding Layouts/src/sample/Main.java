package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Embedding Title");

        //Top menu
        HBox topMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");

        topMenu.setSpacing(20);

        topMenu.getChildren().addAll(button1,button2,button3);

//        Left menu
        VBox leftMenu = new VBox();
        Button button4 = new Button("Navigate");
        Button button5 = new Button("Code");
        Button button6 = new Button("Analyse");

        leftMenu.setSpacing(20);
        leftMenu.getChildren().addAll(button4,button5,button6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
