package com.test.hackerrank.others;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class GemStone {
    byte[]input = new byte[26];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String [] array = new String[number];
        for (int i = 0; i<array.length ; i++) {
            array[i]= scan.next();
        }

        System.out.println(new GemStone().getGemElementCount(array,number) );

    }

    public int getGemElementCount(String[]array, int total)
    {
        int count=0;
        Set<Character> set= new HashSet();
        for (String str:array)
        {
            for (char c:str.toCharArray())
            {
                set.add(c);
            }
            set.stream().forEach(e->input[e-'a']++);
            set.clear();
        }
        for (byte b:input)
        {
            if(b==total)
                count++;
        }
       return count;
    }

}
