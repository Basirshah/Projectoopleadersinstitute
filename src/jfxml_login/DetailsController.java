/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Basir
 */
public class DetailsController  {

    /**
     * Initializes the controller class.
     */
    String fb ;

  @FXML
  private Label facexp;
  
  

 @FXML
 void btnact (ActionEvent event){
     
      facexp.setText(fb);
 }
      
    
}
