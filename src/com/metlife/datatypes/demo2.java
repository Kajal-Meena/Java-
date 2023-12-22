package com.metlife.datatypes;

public class demo2
{
    public static void main(String[] args)
    {
        int a = 10;
        double area = 3.14*a*a;
        System.out.println("area of circle --> " + area);

        int height = 25;
        int base = 1;
    //    double ar = 0.5*base*height;
          int ar = (base*height)/2;
      //  double ar = (double) (base*height)/2;
        System.out.println("area of traingle --> " + ar);

        double x =2.123456789;
        float y = (float) x;
        System.out.println("explicit conversion --> " + y);
    }
}
