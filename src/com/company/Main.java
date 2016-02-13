package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.err.println("SURPRISE MZFK!");
        try {
            throwOne();
        } catch (MyException e) {
            e.toString();
        }
    }

    static void throwOne() throws MyException
    {
        System.out.println("Exception in throwOne");
        throw new MyException(3);
    }
}
