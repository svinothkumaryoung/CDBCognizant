package com.cognizant.cdb.inheritance;
class parentClass{
    int registerNo=6666;
    String name="Vinothkumar Selvaarasan";
    void printdata()
    {
        System.out.println("RegisterNo is "+registerNo);
        System.out.println("Name is "+name);
    }
}
public class SingleInheritance extends parentClass {
    String collegeName="SIET";
    void printCollegeData()
    {
        System.out.println("College Name "+collegeName);
    }

    public static void main(String[] args) {
        parentClass pc=new parentClass();
        pc.printdata();
        SingleInheritance sinherit=new SingleInheritance();
        sinherit.printdata();
        sinherit.printCollegeData();
    }
}
