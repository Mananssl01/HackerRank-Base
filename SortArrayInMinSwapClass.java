// Minimum swaps 2 - HR

// given an unordered array containing n consecutive integers with no duplicate, find min. number os swaps to sort it . in one swap, only two elements can be swapped.
// solution hint - since given numbers are consecutive without duplicates , the 'index' should contain the element 'index+1' in the sorted array.

// update - 9th April 2021. better solution is to rtraverse array linearly and for each element just see whether the previuos element is present or not. 
// if not, then that element is the 'first' element of sorted list. loop within and see while incrementing each time , the element is within the list or not, keepa count. 
// of there is not number of any incremented number, then it is the 'last' element of the array . then just reshuffle the aray from 'first' to 'last' element.
package com.test.hr;

import java.util.function.Function;

public class SortArrayInMinSwapClass {
    public static void main(String[] args) {
        int [] arr = {7, 1, 3, 2, 4, 5, 6};
    System.out.println("result "+swapFunction.apply(arr));
    }

    public static Function<int[],Integer> swapFunction = arr ->
    {
        int count=0;int temp=-1;int limit=0;
        for (int i = 0; true ; i++) {       // note that condition portion is true for infinite loop, which exits on break.
            if(i!=arr[i]-1)
            {
                //swap elements
                count++;
                temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else
                limit++;

            if(limit==arr.length)
                break;

            if(i==arr.length-1)
            {
                i=-1;
                limit=0;
            }

        }
        return count;

    };
}
