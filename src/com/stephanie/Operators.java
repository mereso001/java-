package com.stephanie;

public class Operators {
    public static void main(String[] args) {
        // - + / *
        //comparison(operators)< > <= >= ==
        //and or (operators)
        System.out.println(10+20);
        String fname = "John";
        String lname ="Kim";
        int age = 21;
        String full_name = fname + "  "+lname +" "+ age;
        System.out.println(full_name);


        System.out.println(10/3);
        //casting meaning to convert
        int z = 10;
        System.out.println((double)z);
        int k = (int)10.99;
        System.out.println(k);

        System.out.println(10>20);
        System.out.println(10<=20);
        System.out.println(10==10.0);
        int j = 10;
        double h = 10.0;
        System.out.println(j == h);
        String name = "Mary";
        String jina ="mary";
        System.out.println(name == jina);
        System.out.println(name.equals(jina));
        System.out.println(name.equalsIgnoreCase(jina));
        System.out.println(1000 % 44);//modulus operator
        System.out.println(10 % 3);
        //and
        System.out.println(100 > 200 && "jina".equals("jina"));
        //or
        System.out.println(100 > 200 || "jina".equals("jina"));
        //not equal
        System.out.println(10 != 20);

        System.out.println(!"Kenya".equals("Kenya"));

    }
}
