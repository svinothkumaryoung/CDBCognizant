package com.cognizant.cdb.jdbc;

public class StudentInfo {
    private int sno;
   private int registerNo;
   private String name;
   private String address;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "registerNo=" + registerNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
