package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private Label Manuscrito;
    @FXML
    private TextField texto;



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


}
