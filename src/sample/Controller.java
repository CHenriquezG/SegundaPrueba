package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    private Label Manuscrito;
    @FXML
    private TextField texto;
    @FXML
    private Button nuevo;
    @FXML
    private VBox cajasd;



    public void bot(ActionEvent event){
        System.out.println("tetera");
    }
    public void rotar(){

        try {
            System.out.println(texto.getCharacters());
            int angulo = Integer.parseInt(String.valueOf(texto.getCharacters()));
            Manuscrito.setRotate(angulo);

        }catch (NumberFormatException y){
            System.out.println("no es valido la rotacion puesta");

        }finally{

        }
    }

    public void nuevaven() throws IOException {
        //Emergente ven = new Emergente();

        Stage secundaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Emergente.fxml"));
        secundaryStage.setTitle("Hello World");
        secundaryStage.setScene(new Scene(root, 300, 275));
        secundaryStage.show();

    }
    private void EventoC(Rectangle r,int i,int j){

        r.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if(r.getFill() ==Paint.valueOf("RED")){/*
                    ((Rectangle)((HBox)(cajasd.getChildren().get(i+1))).getChildren().get(j)).setFill(Paint.valueOf("BLUE"));
                    ((HBox)(cajasd.getChildren().get(i-1))).getChildren().get(j)
                    ((HBox)(cajasd.getChildren().get(i))).getChildren().get(j+1);
                    ((HBox)(cajasd.getChildren().get(i))).getChildren().get(j-1);*/
                }else{
                    r.setFill(Paint.valueOf("RED"));
                }


                System.out.println("pos :(click");// se vera en consola las cordenadas de la tabla

                //r.setImage(new Image(getClass().getResource("imagen.png").toExternalForm()));

                //r.setImage(new Image(getClass().getResource("cargar.png").toExternalForm()));


            }

    });



}
    public void CrearMatriz(){

        cajasd.setSpacing(2);
        for(int i=0;i<36;i++){
            HBox cajan = new HBox();
            for(int j=0;j<36;j++){
                Rectangle rec = new Rectangle(15,15);
                EventoC(rec,i,j);
                cajan.getChildren().add(rec);
                cajan.setSpacing(2);
            }
            cajasd.getChildren().add(cajan);

        }
    }
}
