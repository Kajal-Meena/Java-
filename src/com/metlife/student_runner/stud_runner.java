package com.metlife.student_runner;

import com.metlife.student.Student;

public class stud_runner
{
    public static void main(String[] args)
    {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.setRoll_no(35);
        st2.setRoll_no(40);
        st3.setRoll_no(21);
        st1.cr();
        st2.cr();
        st3.cr();

        st1.name = "Jack";
        st2.name = "Peter";
        st3.name = "Mark" ;
        st1.mailID = "jack@gmail.com";
        st2.mailID = "peter@gmail.com";
        st3.mailID = "mark@gmail.com" ;
        st1.percent = 45.2;
        st2.percent= 85.2;
        st3.percent = 56.5;

        Student.school_Address = "Chennai";
        Student.school_name = "Global school";


      /*  System.out.println(" Student Details ---> ");
        System.out.println();
        System.out.println(" First Student ");
        System.out.println(st1.name);
        System.out.println(st1.mailID);
        System.out.println(st1.percent);
        System.out.println(Student.school_name);
        System.out.println(Student.school_Address);
        System.out.println();
        System.out.println(" Second Student ");
        System.out.println(st2.name);
        System.out.println(st2.mailID);
        System.out.println(st2.percent);
        System.out.println(Student.school_name);
        System.out.println(Student.school_Address);
        System.out.println();
        System.out.println(" Third Student ");
        System.out.println(st3.name);
        System.out.println(st3.mailID);
        System.out.println(st3.percent);
        System.out.println(Student.school_name);
        System.out.println(Student.school_Address); */

    }
}
