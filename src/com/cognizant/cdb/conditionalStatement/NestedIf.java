package com.cognizant.cdb.conditionalStatement;

import java.util.Scanner;

public class NestedIf {
    int age;
    String gender;
    Scanner s1=new Scanner(System.in);
    void getage()
    {
        System.out.println("Enter the Age");
        age=s1.nextInt();
        System.out.println("Enter the Gender M(or) m for Male and F(or)f for Female");
        gender=s1.next();
    }
    void checkAge()
    {
        if(age>=60)
        {
           if(gender.equals("M") || gender.equals("m"))
           {
               System.out.println("Middle Birth");
           }
           else
           {
               System.out.println("Lower Birth");
           }
        }
        else
        {
            System.out.println("Upper Birth");
        }
    }

    public static void main(String[] args) {
        NestedIf nf=new NestedIf();
        nf.getage();
        nf.checkAge();
    }

}
