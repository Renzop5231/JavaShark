package PCAP_GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    static Stage window;

    public Main() throws Exception {
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("IP Viewer");
        primaryStage.setScene(new Scene(root, 850, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
