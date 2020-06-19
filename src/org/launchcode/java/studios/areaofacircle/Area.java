package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner inputRadius;

        inputRadius = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = 0.0;

        boolean error = false;
        try {
           radius = inputRadius.nextDouble();

        } catch (Exception e) {
            error = true;
            System.out.println("Radius value is not a number.");
        }

        inputRadius.close();
        if (error == false) {
            if (radius < 0) {
                System.out.println("Radius value of" + radius + " is incorrect.");
            } else {
                area = Circle.getArea(radius);
                System.out.print("The area of the circle of radius " + radius + " is: " + area);
            }
        }




       // if (radius.isNaN()) {
         //   System.out.println("Radius value of " + radius + " is not a number.");


        //area = (3.14 * radius * radius);
        //area = Math.PI * Math.pow(radius,2);
        //System.out.println("The area of the circle with the given radius is: " + area);
    }
}
