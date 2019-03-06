package com.stephanie;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class SwitchCase {
    public static void main(String[] args) {
        int month= 12;
        switch (month)
        {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AGUST");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
        }
    }
}
