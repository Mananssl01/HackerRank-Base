package com.test.hackerrank.others;


public class LookAndSay {
    public static void main(String[] args) {
        System.out.println(new LookAndSay().Look_And_Say("45523233"));
    }

    public String Look_And_Say(String number)
    {
        int count=0;StringBuilder builder = new StringBuilder();
        int i=0,j=i;
        while (i <number.length()) {
            if(j<number.length()&&number.charAt(i)==number.charAt(j))
            {
                count++;
                j++;
            }
            else
            {
                builder.append(count).append(number.charAt(i));
                i=j;
                count=0;

            }
        }
        return builder.toString();
    }
}
