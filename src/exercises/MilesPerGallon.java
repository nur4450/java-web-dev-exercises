package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        int milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles:");
        int miles = input.nextInt();
        Scanner secondInput = new Scanner(System.in);
        System.out.println("Enter amount of gas you've consumed:");
        int gas = secondInput.nextInt();

        milesPerGallon = gas/miles;
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
