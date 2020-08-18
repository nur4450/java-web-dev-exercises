package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        int length = input.nextInt();
        Scanner secondInput = new Scanner(System.in);
        System.out.println("Enter width of the rectangle:");
        int width = secondInput.nextInt();

        area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}



