package com.metlife.employees;

public class Employee_Runner {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

    //    emp1.E_id = 101;
        emp1.E_name = "John";
        emp1.E_salary = 9000;
        emp1.E_performance = "A";
        emp1.E_company = "Metlife";

      //  emp2.E_id = 102;
        emp2.E_name = "Lisa";
        emp2.E_salary = 7000;
        emp2.E_performance = "B";
        emp2.E_company = "Metlife";

        //emp3.E_id = 103;
        emp3.E_name = "Anna";
        emp3.E_salary = 8000;
        emp3.E_performance = "A";
        emp3.E_company = "Metlife";

        System.out.println("First employee details  ---> ");

        System.out.println(emp1.E_name);
        System.out.println(emp1.E_salary);
        System.out.println(emp1.E_performance);
        System.out.println(emp1.E_company);


        emp1.displayEmpRe();
        System.out.println();
        emp1.allocateBonus();
        System.out.println();
        emp1.displayEmpRe();
// Make a method for appreciation wrt E_performance
        emp1.allocateBonus();
        emp1.appreciation();
        emp2.appreciation();
        emp3.appreciation();

    }
}
