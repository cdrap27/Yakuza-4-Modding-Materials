package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BufferedReader br = Files.newBufferedReader(Path.of("modded.csv"), StandardCharsets.US_ASCII);
        Parent root = FXMLLoader.load(getClass().getResource("../Views/Dashboard.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 997, 587));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
