package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a radius:");
        r = s.nextInt();
        //Circle.getArea();
        area = pi * r * r;
        System.out.println("The area of circle of radius:"+area);
    }
}