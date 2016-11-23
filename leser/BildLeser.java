package net.einfach.leser;

import java.awt.image.BufferedImage

public class BildLeser
{
    public static BufferedImage schwarzWeiss(BufferedImage bi, char grau)
    {
        if(!isHex(grau))
        {
            ExceptionLogger.add(new ArithmeticException("Letter is not a valid hex character"));
            return bi;
        }
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
}
