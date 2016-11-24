package net.einfach.leser;

import java.awt.image.BufferedImage;
import java.awt.Color;

public class BildLeser
{
    public static BufferedImage schwarzWeiss(BufferedImage bi, char grau)
    {
        if(!isHex(grau))
        {
            ExceptionLogger.add(new ArithmeticException("Letter is not a valid hex character"));
            return bi;
        }
        
        int grauInt = Integer.parseInt(grau + grau + "", "16");
        for(int i = 0; i < bi.getWidth(); i++)
            for(int j = 0; j < bi.getHeight(); j++)
                if()
    }
    
    public static BufferedImage keineSchlange(BufferedImage bi)
    {
        
    }
    
    public static BufferedImage[] teilen(BufferedImage bi)
    {
    
    }
    
    public static boolean isHex(char c)
    {
        return Character.isNumber(c) || Character.isLetter(c);
    }
    
    public static boolean nebenWeiss(int grau, int farben)
    {
        Color col = new Color(color);
        //TODO Comparators
    }
}
