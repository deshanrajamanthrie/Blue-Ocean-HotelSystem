package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class MainFormController {
    public Label dateLbl;
    public Label timeLbl;



    public void adminOnAction(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("../View/adminLoginForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




    public void RcpOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/ReceptionLoginForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
