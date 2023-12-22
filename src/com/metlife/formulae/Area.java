package com.metlife.formulae;

public class Area
{
    public static double arCircle(int x)
    {
        return 3.14*x*x;
    }
    public static double arTraingle(double x,double y)
    {
        return 0.5 * x * y;
    }
    public double arRectangle(double x,double y)
 //   public static double arRectangle(double x,double y)
    {
        return x * y;
    }
    public String getAuthorName()
 //   public static String getAuthorName()
    {
        return "Steve";
    }

}
