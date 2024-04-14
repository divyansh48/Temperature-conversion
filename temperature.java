package com.divyansh;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the temp in celcius");
        float cel = in.nextFloat();
        float fer = (float) ((cel * 1.8) + 35);

        System.out.println(fer);

    }
}
