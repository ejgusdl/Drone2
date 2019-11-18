package exam04;


import exam04.service1.Service1;
import exam04.service2.Service2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private Button btnService1;
    @FXML private Button btnService2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnService1.setOnAction(btnService1EventHandler);
        btnService2.setOnAction(btnService2EventHandler);
    }

    private EventHandler<ActionEvent> btnService1EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("서비스1 처리합니다.");
            Service1 service1 = new Service1();
            service1.show();
        }
    };

    private EventHandler<ActionEvent> btnService2EventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("서비스2 처리합니다.");
            Service2 service2 = new Service2();
            service2.show();
        }
    };

}
