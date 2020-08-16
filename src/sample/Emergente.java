package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Emergente {

    Stage secundaryStage;
    public Emergente() throws IOException {/*
        secundaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Emergente.fxml"));
        secundaryStage.setTitle("Hello World");
        secundaryStage.setScene(new Scene(root, 300, 275));
        secundaryStage.show();*/
    }
    public Stage getStage(){
        return secundaryStage;
    }
}
