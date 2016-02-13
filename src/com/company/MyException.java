package com.company;

/**
 * Created by uitschool JV on 2/13/2016.
 */
public class MyException  extends Exception {
    private int detail;
    MyException(int a )
    {
        detail = a;
    }

    public String toString()
    {
        return "MyException[" + detail + "]";
    }
}
