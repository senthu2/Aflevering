package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //FlowPane flowPane = new FlowPane();

        //P1 p1 = new P1();
        //P23 p23 = new P23();
        //flowPane.getChildren().add(p1);
        //flowPane.getChildren().add(p23);



        Parent root = FXMLLoader.load((getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Lotto Number");
        //primaryStage.setScene(new Scene(flowPane, 440, 260));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);

    }
}
