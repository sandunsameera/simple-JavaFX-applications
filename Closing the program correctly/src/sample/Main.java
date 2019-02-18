package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
//    Boolean answer = true;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;



        Stage window = new Stage();
        Button button = new Button("Close");
//        Label label = new Label("You can close the program by clicking close");

        window.setOnCloseRequest(e->closeProgram());

        button.setOnAction(e->closeProgram());

        window.setTitle("Closing the program");

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();





    }

    private void closeProgram() {

        Boolean answer = AlertBox.display("Title","Sure to exit?");
        if (answer)
            window.close();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
