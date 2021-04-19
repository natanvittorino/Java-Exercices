package com.company;

/* public is an access modifier. We use it to determine what type of  access we want to allow other
to access our classes.
* Encapsulation in java
* */
public class Car {

    private int door; /*This is a state component of Car class*/
    private int wheel;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }


}
