package com.metlife.math;

public class Volume
{
    public static double vSphere(double r)
    {
        double a = (3.14*r*r*r)* 4/3 ;
        return a;
    }
    public static double vCyl(double r, double h)
    {
        double a = (3.14*r*r*h);
        return a;
    }
    public static double vCone(double r, double h)
    {
        double a = (3.14*r*r*h)*1/3;
        return a;
    }
    public static double vHem(double r)
    {
        double a = (3.14*r*r*r)*2/3;
        return a;
    }
    public static double vCylinder(double r, double h)
    {
        double a = (3.14*r*r)*h;
        return a;
    }
    public static double vCuboid(double l, double b , double h)
    {
        double a = l*b*h;
        return a;
    }
    public static double vSPyr(double s, double h)
    {
        double a = (h*s*s)*1/3;
        return a;
    }
}
