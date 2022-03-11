import java.util.Scanner;

public class GetValueFromUser {
    int registeration;
    String name;
    String emailId;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register Number");
        registeration=s1.nextInt();
        System.out.println("Enter the Name ");
        name=s1.next();
        System.out.println("Enter the Email Id");
        emailId=s1.next();
    }
    void printData()
    {
        System.out.println("Register Number "+registeration);
        System.out.println("Name is "+name);
        System.out.println("Email id "+emailId);
    }

    public static void main(String[] args) {
        GetValueFromUser gvfu=new GetValueFromUser();
        gvfu.getData();
        gvfu.printData();
    }

}
