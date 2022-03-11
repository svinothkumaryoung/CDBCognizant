package com.cognizant.cdb.loopingStatement;

import java.util.Scanner;

public class Forloop {
    int Multiply;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Multiple Number");
        Multiply=s1.nextInt();
    }
    void forLoop()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i +" * "+Multiply+" = "+(i*Multiply));
        }
    }

    public static void main(String[] args) {
        Forloop fl=new Forloop();
        fl.getData();
        fl.forLoop();
    }
}
