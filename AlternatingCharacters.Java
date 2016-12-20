package com.test.hackerrank.others;

import java.util.Scanner;


public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();String [] array = new String[number];
        for (int i = 0; i<array.length ; i++) {
            array[i]= scan.next();
        }
        new AlternatingCharacters().getCount(array);

    }

    public void getCount(String[]array)
    {
        int count=0;int i=0;int j=i+1;
        for (String str :array)
        {
            count=0;i=0;j=i+1;
            while (i <str.length()&&j<str.length()) {
                if(str.charAt(i)==str.charAt(j))

                {
                    count++;
                    j++;
                }else
                {
                    i=j;
                    j=i+1;

                }

            }
            System.out.println(count);
        }
    }
}
