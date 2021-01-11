package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
    //declare class variables


    public Area() {

    }

    //create other methods
    public void calculateArea() {
        //Ask for the radius
        Scanner input = new Scanner(System.in);
        try {
            Double usersRadius = input.nextDouble();

            boolean keepOnlooping = true;
            while (keepOnlooping) {

                //check if the input is a negative number
                if (usersRadius < 0) {
                    System.out.println("you can not enter a negative number!");
                } else {
                    //calculate the area
                    //Area = pi * radius * radius
                    Double area = Circle.getArea(usersRadius);

                    //'print the result'
                    System.out.println(area);

                    keepOnlooping = false;
                }
            }
        } catch (Exception error) {
            System.out.println("you must provide a numeric input");

            //close the scanner
            input.close();
        }
    }
}
