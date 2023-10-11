package com.digital.models;

import lombok.*;


public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String eMail;
    private String phoneNUmber;
    private String currentAddress;
    private String password;
    private String age;
    private String Salary;
    private String Department;

    public Student(String firstName, String lastName, String userName, String eMail, String phoneNUmber, String currentAddress, String password, String age, String salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.eMail = eMail;
        this.phoneNUmber = phoneNUmber;
        this.currentAddress = currentAddress;
        this.password = password;
        this.age = age;
        Salary = salary;
        Department = department;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
