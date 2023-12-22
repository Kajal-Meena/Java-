package com.metlife.methods;

import com.metlife.formulae.Area;

public class Demo1
{
    public static void main(String[] args)
    {
       int  a = 10 ;

       Area obj = new Area();

       double  b = Area.arCircle(4);
        System.out.println("area of Traingle : " + b);

        double c = Area.arTraingle(3,5.2) ;
        System.out.println("area of Traingle : " + c);

        double d = obj.arRectangle(8.3,9) ;
        System.out.println("area of Rectangle : " + d);

        System.out.println("name -->" + obj.getAuthorName());

    }
}