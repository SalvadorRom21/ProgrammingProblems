/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
package com.PP.ProjectEuler;

public class MultiplesOf3And5 {


    public static int sumOfMultiples(int maxNum){
        int sum = 0;
        for(int i = 1; i < maxNum;i++){
            if(i%3==0 || i%5 ==0){
                sum += i;
            }
        }

        return sum;
    }
}

/*
Solution to solve this problem we will create a for loop that will check if the number is a multiple of 3 or 5.
We do this by checking if the number that is being produced by a mod is 0 for either 3 or 5.
If the number meets either of those requirements then we will add it to the sum and continue to the next number.

This will take Time complexity of O(n) where n is the number of the maxNumber.
This will also Take Space complexity of O(1) no new data structure is made.
 */
