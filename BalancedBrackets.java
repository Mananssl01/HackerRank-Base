// class to verify the balanced parrenthesis/brackets.

package com.hackerrank.code;

import java.util.Scanner;
import java.util.Stack;


public class BalancedBrackets {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BalancedBrackets bb = new BalancedBrackets();
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (bb.isBalanced(expression)) ? "YES" : "NO" );
        }
    }

        public static boolean isBalanced(String str)
        {
            if(str.length()%2==1)
                return false;
            Stack<Character> stack = new Stack<>();
            char[] input = str.toCharArray();
            for (char c:input)
                switch (c)
                {
                    case '(':
                        stack.push(')');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    default:
                        if(stack.empty()||c!=stack.peek())
                            return false;
                        stack.pop();
                }

            return stack.empty();
        }


}
