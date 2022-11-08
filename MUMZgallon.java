/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ks
 */
import java.util.Scanner;
public class MUMZgallon {
    public static void main(String[]args){
        Scanner mum = new Scanner(System.in);
        double milesDriven;
        double Gasgallons;
        double mpg;
        
        // INPUT MILES DRIVEN DETAILS
        System.out.println(" Enetr the number of miles driven ");
        milesDriven = mum.nextDouble();
        
        //INPUT GAS USAGE
        System.out.println(" Enetr the number of gallons of gas used ");
        Gasgallons = mum.nextDouble();
        
        //FINDING MPG
        mpg = milesDriven / Gasgallons;
        
        //FINAL OUPUT
        System.out.println(" Your car's miles driven per gallon is " + mpg);
        
       
    }
    
}
