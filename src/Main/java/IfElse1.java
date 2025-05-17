package Main.java;

import java.util.Scanner;

class voteEligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You have eligibility to vote");
        }
        else{
            System.out.println("You dont have eligibility to vote");
        }
    }
}