package com.stephanie;
public class Functions {
    //access modifiers
    //public
    //private
    //protected


    protected double volumeSphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3) * 4/3.0;
        return volume;

    }
    public static double areaCircle(double radius){
        double area= 22/7.0*radius*radius;
        System.out.println(area);
        return area;

    }
    public static void main(String[] args) {
        //objects == variables
        Functions f = new Functions();//create object
        System.out.println(f.volumeSphere(6));
        double v = f.volumeSphere(11);
        Functions.areaCircle(67);




        /*areaCircle(7);
        areaCircle(9.1);
        areaCircle(789);


        double results = areaCircle(889);
        System.out.println(Math.round(results));
        System.out.println(results*4);*/




    }
}
