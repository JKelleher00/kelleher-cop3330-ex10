package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem10 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the price of item 1 ");
        double pr1 = a.nextDouble();
        System.out.print("Enter the quantity of item 1 ");
        double q1 = a.nextDouble();
        System.out.print("Enter the price of item 2 ");
        double pr2 = a.nextDouble();
        System.out.print("Enter the quantity of item 2 ");
        double q2 = a.nextDouble();
        System.out.print("Enter the price of item 3 ");
        double pr3 = a.nextDouble();
        System.out.print("Enter the quantity of item 3 ");
        double q3 = a.nextDouble();
        double st = (q1*pr1)+(q2*pr2)+(q3*pr3);
        double tax = .055*st;
        double t = tax+st;
        String gr = "Subtotal: $" + st + "\nTax: $" + tax + "\ntotal: $" + t;
        System.out.println(gr);
    }
}
