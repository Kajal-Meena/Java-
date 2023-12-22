package com.metlife.student;

public class Student
{
    private int Roll_no;
    public String name;
    public String mailID;
    public double percent;
    public static String school_name;
    public static String school_Address;


    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no)
    {
//        if(Roll_no>=30 && Roll_no<=40)
//        {
            this.Roll_no = roll_no;
//        }
    }
    public void cr()
    {
        System.out.println(getRoll_no());
    }
}
