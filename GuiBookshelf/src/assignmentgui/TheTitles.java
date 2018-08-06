/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentgui;

import java.util.ArrayList;

public class TheTitles {


    Object content[] = new Object[27];
    public String errString="";
    public TheTitles() {

        for(int i=0;i<27;i++)
            content[i] = new ArrayList<String>();

    }
    public void Add(String s)
    {

        char t = s.toUpperCase().charAt(0);
        if (s.trim().length()==0)
        {
            errString="emptyString";
            return;
        }

        int index;
        if ( t >= 'A' && t <= 'Z' )
        {
            index = 1 + t - 'A';
        }
        else
            index = 0;

        ((ArrayList)content[index]).add(s);
        errString="";
        return;
    }

    @Override
    public String toString ()
    {
        String result = "";

        char t = '#';

        if (((ArrayList)content[0]).size() > 0)
        {
            result+= Character.toString(t) + "\n";

            for (int i =0; ((ArrayList)content[0]).size()> i;i++ )
                result+="\t"+ ((ArrayList)content[0]).get(i) + "\n";
        }


        for (int i=1;i<27;i++)
        {
            if (((ArrayList)content[i]).size() > 0)

            {
                t=(char) ('A' + i-1);
                result+= Character.toString(t) + "\n";
                for (int j =0; ((ArrayList)content[i]).size()> j;j++ )
                    result+="\t"+((ArrayList)content[i]).get(j) + "\n";
            }
        }

        return result;
    }
}
