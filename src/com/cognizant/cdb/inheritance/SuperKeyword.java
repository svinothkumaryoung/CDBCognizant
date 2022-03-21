package com.cognizant.cdb.inheritance;

import java.util.Scanner;

class studentInfo{
    int registerNo;
    String name;
    Scanner s1=new Scanner(System.in);
    studentInfo()
    {
        registerNo=6666;
        name="vinothkumar";
    }
    studentInfo(int registerNo,String name)
    {
        this.registerNo=registerNo;
        this.name=name;
    }
    void getData()
    {
        System.out.println("Enter the Register no");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name");
        name=s1.next();
    }
    void printData()
    {
        System.out.println("Register no "+registerNo);
        System.out.println("name "+name);
    }
}

public class SuperKeyword extends studentInfo{
    String country;
    SuperKeyword()
    {
        country="India";
    }
    SuperKeyword(String country,int r,String n)
    {
        super(r,n);
        this.country=country;
    }
    void getCountry()
    {
        super.getData();
        System.out.println("Enter the Country Name");
        country=s1.next();
    }
    void printCountry()
    {
        super.printData();
        System.out.println(" Country Name "+country);
    }

    public static void main(String[] args) {
        SuperKeyword sk=new SuperKeyword();
        sk.getCountry();
        sk.printCountry();
        SuperKeyword sk1=new SuperKeyword("India",6667,"Vinothkumar S");

        sk1.printCountry();
    }


}
