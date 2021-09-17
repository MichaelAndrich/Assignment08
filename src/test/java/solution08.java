/*
 *  UCF COP3330 Fall 2021 Assignment 08 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt the user for how many people
    how many pizzas
    how many slices per pizza
    output evenly divided slices of pizzas to people
    output if there are any leftover pieces
 */


import java.util.Scanner;

public class solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people? ");
        String num1 = sc.nextLine();
        int people = Integer.parseInt("" + num1);

        System.out.println("How many pizzas do you have? ");
        String num2 = sc.nextLine();
        int pizza = Integer.parseInt("" + num2);

        System.out.println("How many slices per pizza? ");
        String num3 = sc.nextLine();
        int slice = Integer.parseInt("" + num3);

        int t_slice = (pizza * slice);  //total slices

        System.out.println("" + (people) + " people with " + (pizza) + " pizzas (" + (t_slice) + " slices)");
        int p_slice = (t_slice / people);  //evenly divided amount of slices
        int r_slice = (t_slice % people);  //leftover slices

        System.out.println("Each person gets "+(p_slice)+ " pieces of pizza. ");
        System.out.println("There are "+(r_slice)+ " remaining slices left. ");

    }
}
