package com.cognizant.cdb.tryandCatch;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleException {
    int a,b,c;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the value for a ");
        a=s1.nextInt();
        System.out.println("Enter the value for b ");
        b=s1.nextInt();
        try{
            c=a/b;
            System.out.println("The mathematical Operation of a/b is "+c);
        }
        catch (NumberFormatException ae)
        {
            System.out.println(ae);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block ");
            //This block is going to execute at any cost if there is an error or no error
        }
        System.out.println("Hai how are u ");

    }

    public static void main(String[] args) {
        SimpleException ss=new SimpleException();
        ss.getData();
    }
}
