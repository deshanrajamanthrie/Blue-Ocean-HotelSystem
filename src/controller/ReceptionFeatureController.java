package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionFeatureController {


    public void reserveOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/reserveRoom.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
    }

    public void maintainOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/MarkRoomMaintance.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/ReceptionLoginForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
