package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        if(radius <= 0){
            System.out.println("You entered invalid number.");
        } else {
            //area = Math.PI * radius * radius;
            area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
input.close();
    }
}
