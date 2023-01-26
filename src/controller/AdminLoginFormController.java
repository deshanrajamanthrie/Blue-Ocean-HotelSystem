package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginFormController {
    public ImageView txtPsswrd;
    public Text txtuser;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/adminFeature.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/MainForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
