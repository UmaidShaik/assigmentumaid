package assignment;

import java.util.Scanner;

class WaterBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of units consumed:- ");
        int units = sc.nextInt();
        int meter_charge = 75;
        int charge;
        if (units<=100){
            charge = units * 5;
        } else {
            if (units <= 250){
                charge = units * 10;
            } else {
                charge = units * 20;
            }
        }
        int water_bill = charge + meter_charge;
        System.out.println("The Total Charge is " + water_bill);
    }
}