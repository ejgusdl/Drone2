package exam04.service1;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Service1 {
    //Field
    private Stage stage;

    //Constructor
    public Service1() {
        try {
            stage = new Stage(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            BorderPane Pane =
                    (BorderPane) FXMLLoader.load(getClass().getResource("Service1.fxml"));
            Scene scene = new Scene(Pane);

            stage.setScene(scene);
            stage.setResizable(false);

        } catch (Exception e) {}
    }

    //Method
    public void show() {
        stage.show();
    }
}
