package com.metlife.runner;

import com.metlife.math.Volume;

public class Runner
{
    public static void main(String[] args)
    {
        double p =  Volume.vCyl(2,3);
        double q =Volume.vCone(4,7);
        double r =  Volume.vCuboid(3.3,4.6,6);
        double s =  Volume.vHem(2);
        double t =  Volume.vSPyr(4,8);

        System.out.println("    Volume   ");
        System.out.println("Cylinder  ---> " + p);
        System.out.println("Cone  ---> " + q);
        System.out.println("Cuboid  ---> " + r);
        System.out.println("Hemisphere  ---> " + s);
        System.out.println("Square Pyramid  ---> " + t);
    }
}
