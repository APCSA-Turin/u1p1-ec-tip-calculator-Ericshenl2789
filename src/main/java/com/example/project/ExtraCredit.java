package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        
        double tip = Math.round(cost * percent + 0.5) / 100.0; //learned from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalBill = cost + tip;
        double perPersonCost = Math.round(cost / people * 100 + 0.05) / 100.0;
        double tipPerPerson = Math.round(tip / people * 100 + 0.05) / 100.0;
        double totalCostPerPerson = (int)(totalBill / people * 100) / 100.0;

        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalBill + "\n");
        result.append("Per person cost before tip: " + "$" + perPersonCost + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = "";
        String userInput = "";

        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);

        while (!userInput.equals("-1")){
            System.out.println("Enter an item name or type -1 to finish: ");
            userInput = scan.nextLine();
            if(!userInput.equals("-1")){
                items = items + userInput + "\n";
            }
        }

        System.out.println(calculateTip(people,percent,cost,items));
    }
}
