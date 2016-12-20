package com.test.hackerrank.others;

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String input = scan.next();

        if(number!=input.length())
            return;
        new BeautifulBinaryString().printResult(input);
    }
    public void printResult(String str)
    {
        String pattern = "010";int count=0;
        int i=str.length();
        while (i>0)
        {
            i=str.lastIndexOf(pattern);
            if(i==-1)
                break;
            str=str.substring(0,i);
            count++;
        }

        System.out.println(count);



    }
}
