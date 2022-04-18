package com.masai.EvalluationC2.Question4;

import java.util.Scanner;

public class BankNotePress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount 10 or 100 or 1000");

        // Taking order from clint
        int note = sc.nextInt();

        // calling the factory according the order given by clint using Factory pattern
        if(note==10){
            Factory factory = new Size1();
            System.out.println(factory.SizeOfNote());
        }
        else if(note ==100){
            Factory factory = new Size2();
            System.out.println(factory.SizeOfNote());
        }
        else if(note == 1000){
            Factory factory = new Size3();
            System.out.println(factory.SizeOfNote());
        }
        else{
            System.out.println("Please Enter valid number");
        }
    }
}
