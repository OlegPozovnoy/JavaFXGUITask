/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Oleg
 */
public class CalcClass {
 
    private double arg1;
    private String operator;
    private String err;
    
    CalcClass(){
        arg1=0;
        operator="";
        err="";
    }
    
    
    void doOperation(String newOperator, String argument)
    {
        double newArg;
        err="";
        try
        {
         newArg = Double.parseDouble(argument);
         switch (this.operator){
             case "+":
                 arg1 = arg1+newArg;
                 operator = newOperator;
                 break;
             case "-":
                 arg1 = arg1-newArg;
                 operator = newOperator;
                 break;   
             case "x":
                 arg1 = arg1*newArg;
                 operator = newOperator;
                 break; 
             case "/":
                 if (newArg==0)
                     throw new IllegalArgumentException("Divide by 0");
                 arg1 = arg1/newArg;
                 operator = newOperator;
                 break; 
             default:
                 arg1 = newArg;
                 operator = newOperator;
            }
        }
         catch (Exception e)
         {
             err = e.getMessage();
         }
    }
    
    
    double getArg1(){
        return this.arg1;
    }
    
    String getOperator(){
        return this.operator;
    }
    
    String getError(){
        return this.err;
    } 
    
    void setError(String error)
    {
        this.err = error;
    }
    
    void setOperator(String operator)
    {
        this.operator = operator;
    }
}
