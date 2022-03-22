package com.cognizant.cdb.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;


public class SingletonCall implements JdbcOperationInter{

    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    StudentInfo si=new StudentInfo();
    int choice;
   public static  Connection c=null;
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
           c= DriverManager.getConnection("jdbc:mysql://localhost:3306/cdb","root","12345678");

        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    public void getData()
    {
        try{
            System.out.println("Enter the Register Number ");
            si.setRegisterNo(Integer.parseInt(bufferedReader.readLine()));
            System.out.println("Enter the Name ");
            si.setName(bufferedReader.readLine());
            System.out.println("Enter the address ");
            si.setAddress(bufferedReader.readLine());
        }
        catch (IOException ioe){
        System.out.println(ioe);
    }
    }
    public void insertData()
    {
        try{

            Connection c=SingletonCall.getCon();
            PreparedStatement ps=c.prepareStatement("insert into registerno(registerno,name,address) values(?,?,?)");
            ps.setInt(1,si.getRegisterNo());
            ps.setString(2,si.getName());
            ps.setString(3,si.getAddress());
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("Insert Operation Done Successfully");
            }
            else{
                System.out.println("Error in Insertion");
            }

        }

        catch(SQLException ss){
            System.out.println(ss);
        }

    }
    public void reteriveInfo()
    {
        try{

            Connection c=SingletonCall.getCon();
            PreparedStatement ps=c.prepareStatement("select * from registerno");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println("Sno "+rs.getInt(1)+" Register Number "+rs.getInt(2)+" Name "+rs.getString(3)+" Address "+rs.getString(4));
            }
        }

        catch (SQLException sqle)
        {
            System.out.println(sqle);
        }
    }



    public void UserChoice()
    {

        try{
            System.out.println("Enter your Choice ");
            System.out.println("1.Insert \n2.Reterive\n3.Update\n4.Delete");
            choice=Integer.parseInt(bufferedReader.readLine());
            switch(choice)
            {
                case 1:
                    this.getData();
                    this.insertData();
                    break;
                case 2:
                    this.reteriveInfo();
                    break;
                case 3:
                    System.out.println("Update Operation Yet to Come");
                    break;
                case 4:
                    System.out.println("Delete Operation yet to Come");
                    break;

            }
        }

            catch (IOException ioe){
                System.out.println(ioe);
            }
        }


    public static void main(String[] args) throws IOException {
        SingletonCall singletonCall=new SingletonCall();
        singletonCall.UserChoice();
    }
}
