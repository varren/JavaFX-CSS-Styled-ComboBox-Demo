package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox root = new HBox();
        primaryStage.setTitle("Combo Box Style From Css");


        ComboBox combobox = new ComboBox<String>(FXCollections.observableArrayList("One", "Two", "Three"));
        combobox.getSelectionModel().select(0);
        combobox.setId("changed");

        ComboBox normalCombobox = new ComboBox<String>(FXCollections.observableArrayList("One", "Two", "Three"));
        normalCombobox.getSelectionModel().select(0);

        root.getChildren().addAll(combobox, normalCombobox);
        Scene scene = new Scene(root, 300, 275);
        scene.setFill(Color.WHITE);
        String css = Main.class.getResource("styles.css").toExternalForm();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(css);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
