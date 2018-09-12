/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentgui;


import javafx.scene.paint.Color;
/**
 *
 * @author Oleg
 */
public class Student {
    
    private String studentName;
    private Color studentMyColor;
    
    Student ()
    {
        this.studentName = "";
        this.studentMyColor = null;//MyColor.EMPTY;
    }

    Student (String name, Color color)
    {
        this.studentName = name;
        this.studentMyColor = color;
    }
    
    String getName()
    {
        return studentName;
    }
    
    Color getMyColor()
    {
        return studentMyColor;
    }
    
    public String toString()
    {
        return studentName + " " + ((studentMyColor== null) ? "null" : studentMyColor.toString());
    }
            
}
