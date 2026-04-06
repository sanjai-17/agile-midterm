package com.attendance;
import java.util.Scanner;
public class App{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter student name:");
        String name=sc.nextLine();
        System.out.print("Total class conducted:");
        int total =sc.nextInt();
        System.out.print("Total class attended:");
        int attended=sc.nextInt();
        double percentage=(attended*100.0)/total;
        System.out.println("\n----Attendence Report-----");
        System.out.println("Name:"+name);
        System.out.println("Attendence:"+percentage+"%");
        if(percentage>=75){
            System.out.println("Status:eligible");
        }
        else{
            System.out.println("Status:not eligible");
        }
    }
}
