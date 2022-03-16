package com.cognizant.cdb.array;

import java.util.Scanner;

public class BasicsArray {
    int registerNo;
    String name;
    int marks[]=new int[5];
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register no");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name");
        name=s1.next();
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for "+(i+1));
            marks[i]=s1.nextInt();
        }
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks for Subject "+(i+1)+"  "+marks[i]);
        }
    }

    public static void main(String[] args) {
        BasicsArray ba=new BasicsArray();
        ba.getData();
        ba.printData();
    }
}
