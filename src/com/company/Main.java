package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	   try{
           int a = args.length;
           int b = 42/a;
           System.out.println("a=" + a);
           function(a);
       }catch (ArithmeticException e)
       {
           System.out.println("Delenie na nol: " + e);
       }
    }

    public static void function(int a )
    {
        try{
            if(a == 1 )
                a = a / (a-a);
            if(a == 2){
                int[] c = {1};
            c[42] = 99;}
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds" + e);
        }
    }
}
