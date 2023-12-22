package com.metlife.employees;

public class Employee
{
    private int E_id;
    public String E_name;
    public double E_salary;
    public String E_performance;
    public String E_company;

    private static int counter = 101;
    public void displayEmpRe()
    {
        System.out.println(E_id);
        System.out.println(E_name);
        System.out.println(E_salary);
        System.out.println(E_performance);
        System.out.println(E_company);
    }
    public Employee()
    {
        E_id = counter;
        counter =counter+1;
        System.out.println("object created");
        System.out.println("object launched");
    }
    public Employee(int E_id)
    {
        if(E_id>100)
        {
            this.E_id = E_id;
        }
        else
        {
            System.out.println("Default value is set");
        }
    }
    public void allocateBonus()
    {
        if(E_performance.equalsIgnoreCase("a"))
        {
            E_salary = E_salary+5000;
        } else if (E_performance.equalsIgnoreCase("b"))
        {
            E_salary = E_salary+3000;
        }
        else
        {
        E_salary = E_salary+2000;
        }

    }
    public void appreciation()
    {
        if(E_performance.equalsIgnoreCase("a"))
        {
            System.out.println("First Position");
        } else if (E_performance.equalsIgnoreCase("b"))
        {
            System.out.println("Second Position");
        }
        else
        {
            System.out.println("Improve your performance");
        }
    }
}
