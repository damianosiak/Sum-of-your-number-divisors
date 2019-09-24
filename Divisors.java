package com.damianosiak;

import java.util.Scanner;

public class Divisors {
    public static void div(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your whole number: ");
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum of all divisors of your number '"+n+"' is '"+sum+"'");
    }
}
