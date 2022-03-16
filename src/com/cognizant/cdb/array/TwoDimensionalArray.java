package com.cognizant.cdb.array;

import java.util.Scanner;

public class TwoDimensionalArray {
    String roomNo[][]=new String[2][3];
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        for(int i=0;i<roomNo.length;i++)
        {
            for (int j=0;j<roomNo[i].length;j++)
            {
                System.out.println("Enter the product u need to Store in Room No "+(i+1)+(j+1));
                roomNo[i][j]=s1.next();
            }
        }

    }
    void printData()
    {
        for(int i=0;i<roomNo.length;i++)
        {
            for (int j=0;j<roomNo[i].length;j++)
            {
                System.out.println("the product Store in Room No "+(i+1)+(j+1)+" "+roomNo[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        TwoDimensionalArray tda=new TwoDimensionalArray();
        tda.getData();
        tda.printData();
    }
}
