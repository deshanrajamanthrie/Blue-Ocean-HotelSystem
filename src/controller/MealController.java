package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MealController {

    public void addMealOnActon(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/addMeal.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void deleteOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/deleteMeal.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void modifyOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/modifyMeal.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View/adminFeature.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
