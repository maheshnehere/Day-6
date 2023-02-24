package com.bridgelabz;

public class FibonacciNumber {

    public static void main(String[] args) {

        int firstnum =1, secondNum =2,num=10;


        for (int i =1;i<num;i++){

            System.out.println(firstnum+",");

            int nextNum=firstnum+secondNum;
            firstnum=secondNum;
            secondNum=nextNum;

        }
    }
}
