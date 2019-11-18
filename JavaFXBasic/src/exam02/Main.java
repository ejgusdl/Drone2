package exam02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("init()"); //처음에 초기화할 내용을 있다면 여기에 넣어라
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start()");
        primaryStage.setTitle("나의 JavaFX 윈도우");
        //primaryStage.setWidth(600);
        //primaryStage.setHeight(400);
        primaryStage.setMaximized(true);

        //AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("Main.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        AnchorPane anchorPane = (AnchorPane) fxmlLoader.load();

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);


        primaryStage.show(); // 원도우 보여주기 ui를 보여주는 코드를 여기 넣어라


    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()"); //종료가 될때 마무리 작업을 도와줌 마무리 코드를 넣어라
    }

    public static void main(String[] args) {
        launch(args);
    }
}
