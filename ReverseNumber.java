package com.bridgelabz;
import java.util.Scanner;
public class ReverseNumber {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter input =");

            int num = sc.nextInt();

            int digit;

            int reverse = 0;


            while (num != 0) {

                digit = num % 10 ;

                reverse = reverse * 10 + digit;

                num /= 10;
            }
            System.out.println("Reverse Number = "+reverse);
        }
    }

