/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Oleg
 */
public class FXMLDocumentController implements Initializable {
    
    CalcClass calc = new CalcClass();
    
    boolean newStr = true;
    
    @FXML
    private Label labelResult;

    @FXML
    private Label labelErr;

    @FXML
    private Button num0;

    @FXML
    private Button num1;

    @FXML
    private Button num2;

    @FXML
    private Button num3;

    @FXML
    private Button num4;

    @FXML
    private Button num5;

    @FXML
    private Button num6;

    @FXML
    private Button num7;

    @FXML
    private Button num8;

    @FXML
    private Button num9;

    @FXML
    private Button numdot;

    @FXML
    private Button operEq;

    @FXML
    private Button operPlus;

    @FXML
    private Button operMinus;

    @FXML
    private Button operMult;

    @FXML
    private Button operDiv;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Button next = (Button)event.getSource();
       
        try{
        
        if (next.getText().equals("=") 
                || next.getText().equals("/") 
                || next.getText().equals("x")
                || next.getText().equals("+")
                || next.getText().equals("-") )
        {
            if (calc.getError().length()>0)
                {
                    calc.setOperator(next.getText());
                    calc.setError("");
                }
            else
            {
                if (newStr == false)
                {
                    calc.doOperation(next.getText(), labelResult.getText());
                    labelErr.setText(calc.getError());
                    labelResult.setText(Double.toString(calc.getArg1()));
                }
                else
                {
                    calc.setOperator(next.getText());                  
                }
            }
            newStr = true;
        }
        else
        {
            if (newStr){
            labelResult.setText(next.getText());
            newStr = false;
            }
            else
            {
                labelResult.setText(labelResult.getText() + next.getText());
            }
        }
        
        
        }
        catch(Exception e)
        {
        labelErr.setText(e.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
