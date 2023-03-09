package com.bridglabz;

import java.util.Scanner;

public class LineComparison {
    int x1,x2,y1,y2,x3,x4,y3,y4;
    int lengthofline1,lengthofline2;
    public void LengthOfLine1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison program.");
        System.out.println("Enter the value of x1");
        x1 = sc.nextInt();
        System.out.println("Enter the value of X2");
        x2 = sc.nextInt();
        System.out.println("ENter the value of y1");
        y1 = sc.nextInt();
        System.out.println("Enter the value of y2:");
        y2 = sc.nextInt();
        lengthofline1 = (int)Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of Line1 is : "+lengthofline1);
    }
    public void LengthOfLine2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x3:");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3:");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4:");
        x4 =sc.nextInt();
        System.out.println("Enter the value of y4:");
        y4 = sc.nextInt();
        int lengthofline2 = (int)Math.sqrt((x3^2-x4^2)+(y3^2-y4^2));
        System.out.println("length of line 2 is : "+lengthofline2);
    }
    public void Checkequal() {
        String str1 = Double.toString(lengthofline1);
        String str2 = Double.toString(lengthofline1);

        if (str1.equals(str2) == true)
            System.out.println("Both lines are equal");
        else
            System.out.println("Not both lines are equal");

        if(lengthofline1<lengthofline2)
        {
            System.out.println("line 2 is greater than line 1");
        }
        else {
            System.out.println("line 1 is greater than line 2");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LineComparison lc = new LineComparison();
        lc.LengthOfLine1();
        lc.LengthOfLine2();
        lc.Checkequal();
    }
}
