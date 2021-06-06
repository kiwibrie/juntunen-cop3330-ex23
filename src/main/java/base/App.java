package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        myApp.carSilent();
    }

    public boolean promptQuestion(String que){
        System.out.print(que + " ");
        String ans = in.nextLine();
        while(ans != null){
            if(ans.equalsIgnoreCase("yes") ||
                    ans.equalsIgnoreCase("y")){
                return true;
            } else if (ans.equalsIgnoreCase("no") ||
                    ans.equalsIgnoreCase("n")){
                return false;
            } else {
                System.out.print("Please enter yes or no.");
                ans = in.nextLine();
            }
        }
        return false;
    }

    public void carSilent(){
        String que = "Is the car silent when you turn the key?";
        boolean answer = promptQuestion(que);
        if(answer){
            batteryTerminals();
        } else {
            carSlicking();
        }
    }

    public void batteryTerminals(){
        String que = "Are the battery terminals corroded?";
        boolean answer = promptQuestion(que);
        if(answer){
            System.out.print("Clean the terminals and try starting again.");
        } else {
            System.out.print("Replace cables and try again.");
        }
    }

    public void carSlicking(){
        String que = "Does the car make a slicking noise?";
        boolean answer = promptQuestion(que);
        if(answer){
            System.out.print("Replace the battery.");
        } else {
            carFailToStart();
        }
    }

    public void carFailToStart(){
        String que = "Does the car crank up but fail to start?";
        boolean answer = promptQuestion(que);
        if(answer){
            System.out.print("Check spark plug connections.");
        } else {
            engineStartThenDie();
        }
    }

    public void engineStartThenDie(){
        String que = "Does the engine start and then die?";
        boolean answer = promptQuestion(que);
        if(answer){
            carFuelInjection();
        } else {
            System.out.print("This should not be possible.");
        }
    }

    public void carFuelInjection(){
        String que = "Does your car have fuel injection?";
        boolean answer = promptQuestion(que);
        if(answer){
            System.out.print("Get it in for service.");
        } else {
            System.out.print("Check to ensure the choke is opening and closing.");
        }
    }

}
