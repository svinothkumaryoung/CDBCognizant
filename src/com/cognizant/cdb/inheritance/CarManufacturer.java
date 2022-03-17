package com.cognizant.cdb.inheritance;

import java.util.Scanner;

class CarOwner{
    String carNo;
    String carName;
    String carType;
    Scanner s1=new Scanner(System.in);
    void getOwnerDetails(){
        System.out.println("Enter the car Number");
        carNo=s1.next();
        System.out.println("Enter the car Name");
        carName=s1.next();
        System.out.println("Enter the car Type");
        carType=s1.next();
    }
    void printOwnerDetails()
    {
        System.out.println("Car Number"+carNo);
        System.out.println("Car Name"+carName);
        System.out.println("Car Type"+carType);
    }


}

class CarDealer extends CarOwner {
    String DealerName;
    String DealerGSTNo;
    void getDealerDetails()
    {
        System.out.println("Enter the Dealer Name");
        DealerName=s1.next();
        System.out.println("Enter the Dealer GSTNo");
        DealerGSTNo=s1.next();
    }
    void printDealerData()
    {
        System.out.println("Dealer Name "+DealerName);
        System.out.println("Dealer GST No"+DealerGSTNo);
    }


}

public class CarManufacturer extends CarDealer{
    String CEOName;
    String AddressOfHeadOffice;
    String GSTNo;
    void getManufacturerDetails()
    {
        System.out.println("Enter the CEO Name ");
        CEOName=s1.next();
        System.out.println("Enter the Address of Head Office ");
        AddressOfHeadOffice=s1.next();
        System.out.println("Enter the GST Number ");
        GSTNo=s1.next();
    }
    void printanufacturerDetails()
    {
        System.out.println("CEO Name "+CEOName);
        System.out.println("Address of Head Office "+AddressOfHeadOffice);
        System.out.println("GST Number "+GSTNo);

    }

    public static void main(String[] args) {
        CarManufacturer cm=new CarManufacturer();
        cm.getOwnerDetails();
        cm.getDealerDetails();
        cm.getManufacturerDetails();
        System.out.println(" ***************   ************ ");
        cm.printOwnerDetails();
        cm.printDealerData();
        cm.printanufacturerDetails();

    }
}
