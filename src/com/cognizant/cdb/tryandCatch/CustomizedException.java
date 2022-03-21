package com.cognizant.cdb.tryandCatch;

import java.util.Scanner;

class CustomizedExcepCreation extends Exception{
    CustomizedExcepCreation(String errorMsg)
    {
        super(errorMsg);
    }
}
public class CustomizedException {
    String productName;
    int qty;
    Scanner s1=new Scanner(System.in);
    void getData() throws CustomizedExcepCreation
    {
        System.out.println("Enter the Product Name");
        productName=s1.next();
        System.out.println("Enter the Product Quantity ");
        qty=s1.nextInt();
        if(qty>=5)
        {
           throw new CustomizedExcepCreation ("Maximum product U can purchase is 5");
        }
    }
    public static void main(String[] args)  {
        CustomizedException ce=new CustomizedException();
        try{
            ce.getData();
        }
        catch (CustomizedExcepCreation ss)
        {
            System.out.println(ss);
        }
    }
}
