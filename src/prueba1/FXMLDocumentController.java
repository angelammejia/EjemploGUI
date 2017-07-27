/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.awt.TextField;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author angela_maria.marin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textfield_nombre;
    
    @FXML
    private TextField textfield_codigo;
    LinkedList<Persona> lista;
    
    @FXML
    private void handleButtonActionA(ActionEvent event) {
        String nombre = textfield_nombre.getText();
        String codigo = textfield_codigo.getText();
        
        Persona objE = new Persona (nombre, codigo);
        boolean ss = lista.add(objE);
        if(ss){
            textfield_nombre.setText("");
            textfield_codigo.setText("");
        }

    
        }
    @FXML
    private void handleButtonActionM(ActionEvent event) {
        String mostrar = "";
        for(int i=0; i<lista.size(); i++){
            mostrar += lista.get(i);
        }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lista = new LinkedList<>();
    }    
    
}
