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

    public FieldStruct fldStr= new FieldStruct(9);
    
    @FXML
    private Label lblHeader;
    
    @FXML 
    private Button btnAddStudent;
    
    @FXML 
    private ColorPicker clrPicker;
    
   @FXML 
    private TextField txtStudentName;
    
    @FXML 
    private Label lblErr;
    
    @FXML
    private Pane pane00;
    
    @FXML
    private GridPane grdPane;
    
    @FXML
    private void letsTestThisShit(ActionEvent event) {

        
        fldStr.addStudent(txtStudentName.getText(), clrPicker.getValue());
        lblErr.setText(fldStr.getErrString());
        
        txtStudentName.setText("");
        
        System.out.println(fldStr.toString());

        
        for (Node node : grdPane.getChildren()) 
        {
            
         //System.out.println(node.toString());   
         //         System.out.println( grdPane.getRowIndex(node));  
         //         System.out.println( grdPane.getColumnIndex(node));  
                  
            Integer i = GridPane.getColumnIndex(node);
            Integer j = GridPane.getRowIndex(node);
            
            if (i == null)
                i=0;
            
            if (j==null)
                j=0;
            

            Color tmp;          
                      
            if (node instanceof Pane)
                if(fldStr.getColor(3*i+j) != null)
                    {
                        tmp = fldStr.getColor(3*i+j);
                        node.setStyle("-fx-background-color: " + String.format("#%02X%02X%02X",(int)(tmp.getRed() * 255 ),(int)(tmp.getGreen() * 255 ),(int)(tmp.getBlue() * 255 ) ) + ";");
                    }
            
            if  (node instanceof Label)
                {
                     Label lblTmp = (Label)node;
                     
                     if (fldStr.getName(3*i+j) != null)
                        lblTmp.setText(fldStr.getName(3*i+j));
                     
                }
            
            
        }
       
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    

}
