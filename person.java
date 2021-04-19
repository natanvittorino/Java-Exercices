package com.company;

public class person {
    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {

        }
        this.age = age;

    }

    public boolean isTeen() {
        if (age > 12 && age < 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
       if (firstName.isEmpty()){
            return lastName;
        } else if (lastName.isEmpty()){
           return firstName;
       }
       return firstName + " " + lastName;
       }

    }

