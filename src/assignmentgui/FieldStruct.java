/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentgui;

import java.util.Random;
import javafx.scene.paint.Color;

/**
 *
 * @author Oleg
 */
public class FieldStruct {
    Student[] students;
    private int capacity;
    private int remainigCapacity;
    private String errString;
    
    FieldStruct(int n)
    {
        this.students = new Student[n];
        
        for (int i = 0 ; i < students.length; i++)
        {
        students[i] = new Student();
        }
            
        
        this.capacity = n;
        this.remainigCapacity = n; 
        this.errString = "";
    }
    
    
   boolean addStudent(String name, Color color)
   {
       
       try{
       
       
       this.errString = "";
       
       System.out.println(name);
       System.out.println(color.toString());
       
      
       if ((name !=null && name.trim().length() == 0) || name == null)
       {
             this.errString = "Please enter valid student name";
             return false;      
       }
        
       if (this.remainigCapacity <= 0)
        {
             this.errString = "Sorry, there's no room for a new student";
             return false;
        }
       
       for (int i = 0; i<students.length; i++)
       {
           if (students[i].getMyColor() != null && color.toString().equals(students[i].getMyColor().toString()))
           {
             this.errString = "Sorry, the color " + color.toString() + " is already in use by " + students[i].getName();
             return false;            
           }
                    
       }
       
       Random  rnd = new Random();
       
       int nextItem = rnd.nextInt(remainigCapacity);
       
       System.out.println("Remaining capacity: " +remainigCapacity);
       System.out.println("random returned : " +nextItem);       
       
       for (int i = 0; i<students.length ; i++)
       {
           if (students[i].getName().equals(""))
           {
                if (nextItem == 0) 
                    {
                        students[i] = new Student(name.trim(), color);
                        this.remainigCapacity--;
                        
                        if (this.remainigCapacity == 0)
                            this.errString = "Congrats, you are succesfully placed all students";
                        
                        return true;                        
                    }
                else
                    nextItem--;
           }    
                   
       }
       
       return true;
       }
       catch(Exception e)
       {
        System.out.println(e.getMessage());
       }
       finally{
       return false;
       }
   }
    
    String getErrString() {return errString;}
  
    Color getColor(int index)
    {
        if (0<=index && index<capacity)
            return students[index].getMyColor();
        else
            return null;
    }

    String getName(int index)
    {
        if (0<=index && index<capacity)
            return students[index].getName();
        else
            return null;
    }
    
    public int getCapacity(){return this.capacity;}
    public int getRemainigCapacity(){return this.remainigCapacity;}
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder("");
        
        for (Student t : students)
        {
        sb.append(t.toString());
        sb.append("\n");
        }
       
        return sb.toString();
        
        
    }
}
