package syk.sample.gcs.main.service1;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import syk.sample.gcs.main.GcsMain;

public class Service1 {
    //Field
    private Stage stage;

    //Constructor
    public Service1() {
        try {
            stage = new Stage(StageStyle.UTILITY);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(GcsMain.instance.primaryStage);
            BorderPane Pane =
                    (BorderPane) FXMLLoader.load(getClass().getResource("Service1.fxml"));
            Scene scene = new Scene(Pane);
            scene.getStylesheets().add(GcsMain.class.getResource("style_dark.css").toExternalForm());
            stage.setScene(scene);
            stage.setResizable(false);

        } catch (Exception e) {}
    }

    //Method
    public void show() {
        stage.show();
    }
}
