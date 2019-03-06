package com.stephanie;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {99,22,895,29,95,75,93,68,84,78,85,87,98,59,37,74,78,};
        String names[] = {"Jane","Mercy","Tom","Jimmy","Div"};
        System.out.println(marks[0]);
        System.out.println(names[3]);
        try{
            System.out.println(names[10]);
        }
        catch (Exception e)
        {
            System.out.println("Error while  fetching the name");
        }
        System.out.println(marks[0]);

        Functions.areaCircle(854);

    }
}
