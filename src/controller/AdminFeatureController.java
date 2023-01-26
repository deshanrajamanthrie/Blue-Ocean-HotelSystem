package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFeatureController {
    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/room.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void IncomeOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/incomeReports.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/meal.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/adminLoginForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
