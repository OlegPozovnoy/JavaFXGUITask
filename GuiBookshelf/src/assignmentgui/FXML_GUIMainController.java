/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author Oleg
 */
public class FXML_GUIMainController implements Initializable {

    public TheTitles fldStr= new TheTitles();
    
    @FXML
    private Label lblHeader;
    
    @FXML 
    private Button btnAddStudent;
       
   @FXML 
    private TextField txtStudentName;
    
    @FXML 
    private Label lblErr;
    
    @FXML
    private Pane pane00;
       
    @FXML
    private void letsTestThisShit(ActionEvent event) {

        
        fldStr.Add(txtStudentName.getText());
        lblErr.setText(fldStr.errString);
        
        txtStudentName.setText("");
        lblHeader.setText(fldStr.toString());
        System.out.println(fldStr.toString());

        

       
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    

}
