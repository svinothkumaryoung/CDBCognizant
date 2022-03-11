package com.cognizant.cdb.conditionalStatement;

import java.util.Scanner;

public class SwitchState {
    String AccessRights;
    Scanner s1=new Scanner(System.in);
    void getandcheck()
    {
        System.out.println("Enter the Access Rights");
        AccessRights=s1.next();
        switch (AccessRights)
        {
            case "Admin":
                System.out.println("Move towards Admin Page");
                break;
            case "Staff":
                System.out.println("Move towards Staff Page");
                break;
            default:
                System.out.println("Please login with Proper Credentials");
                break;
        }
    }
    public static void main(String[] args) {
        SwitchState ss=new SwitchState();
        ss.getandcheck();
    }
}
