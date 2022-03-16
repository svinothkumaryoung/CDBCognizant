package com.cognizant.cdb.array;

import java.util.Scanner;

public class ArrayDecalreDefine {
    int registerNo;
    String name;
    int marks[];
    int size;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register Number ");
        registerNo=s1.nextInt();
        System.out.println("Enter the name ");
        name=s1.next();
        System.out.println("Enter the Total No of Subject ");
        size= s1.nextInt();
        marks=new int[size];
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for the subject "+(i+1));
            marks[i]=s1.nextInt();
        }
    }
    void printData()
    {
        int total=0;
        System.out.println("Register Number "+registerNo);
        System.out.println("Name is "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks for Subject "+(i+1)+" is "+marks[i]);
            total=total+marks[i];
        }
        float percentage=total/marks.length;
        System.out.println("Total Marks is "+total);
        System.out.println("Percentage is "+percentage);
        if(90 <=percentage && 100>= percentage)
        {
            System.out.println("Grade is S");
        }
        else if(80  <=percentage && 89>= percentage)
        {
            System.out.println("Grade is A");
        }
        else
        {
            System.out.println("Remaining Grade u");
        }

    }

    public static void main(String[] args) {
        ArrayDecalreDefine add=new ArrayDecalreDefine();
        add.getData();
        add.printData();
    }
}
