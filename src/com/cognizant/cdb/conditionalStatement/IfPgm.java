package com.cognizant.cdb.conditionalStatement;

import java.util.Scanner;

public class IfPgm {
    int salary;
    Scanner s1=new Scanner(System.in);

    void getSalary()
    {
        System.out.println("Enter your monthly salary");
        salary=s1.nextInt();

    }
    void checkCondition()
    {
        if(salary>80000) {
            System.out.println("A grade");
        }
        else
        {
            System.out.println("B grade");
        }

    }

    public static void main(String[] args) {
        IfPgm ifpg=new IfPgm();
        ifpg.getSalary();
        ifpg.checkCondition();
    }
}
