package Main;

import Read.readBase;
import Read.readDesigns;
import Read.readMods;
import Read.readParts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        setLists();
        Parent root = FXMLLoader.load(getClass().getResource("../Views/Dashboard.fxml"));
        primaryStage.setTitle("Dashboard");
        primaryStage.setScene(new Scene(root, 1395, 896));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    public void setLists() throws IOException {
        Read.openCSV.setLines("designs");
        readDesigns.setDesignList();
        Read.openCSV.setCompleteLines("designs");
        readDesigns.setCompletedDesignList();
        Read.openCSV.setLines("parts");
        readParts.setPartList();
        Read.openCSV.setCompleteLines("parts");
        readParts.setCompletePartList();
        Read.openCSV.setLines("modded");
        readMods.setModList();
        Read.openCSV.setCompleteLines("modded");
        readMods.setCompletedDesignList();
        Read.openCSV.setLines("updated");
        readBase.setBaseList();
        Read.openCSV.setCompleteLines("updated");
        readBase.setCompletedBaseList();
        readParts.setCompleteQty();
        readParts.setQty();
        readBase.setCompleteQty();
        readBase.setQty();

    }
}
