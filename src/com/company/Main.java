package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        float temperature = 100.0f; //Initialize

        float low = 97.5f;
        float normal = 99.5f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the current temperature: ");
        temperature = scanner.nextFloat(); // Asks for user input (will ERROR if a non-float is inputted)

        //checks to see if the temperature is low, normal, or high
        if(temperature < low){
            System.out.println("The temperature inputted is " + temperature + ". That is low");
        }
        else if(temperature < normal){
            System.out.println("The temperature inputted is " + temperature + ". That is normal");
        }
        else{
            System.out.println("The temperature inputted is " + temperature + ". That is high");
        }
    }
}
