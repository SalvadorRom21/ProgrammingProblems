/*
The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 ... + 10^2 = 385

The square of the sum of the first ten natural numbers is, (1+2+3 ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

3025 - 385 = 2640

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package com.PP.ProjectEuler;

public class SumSquareDifference {
    public static void sumSquareDiff() {
        Long sumSingleSquared = 0L;
        Long sumAllSquared = 0L;
        Long Total = 0L;
        for (int i = 1; i <= 100; i++) {
            sumSingleSquared = sumSingleSquared + (i * i);
            sumAllSquared = sumAllSquared + i;
        }
        sumAllSquared = sumAllSquared * sumAllSquared;
        Total = sumAllSquared - sumSingleSquared ;
        System.out.println(Total);
    }
}

/*
Solution

The way to approach this is to make a for loop from 1 - 100 and then keep track of all the singleSqaured sum of every numer
and keep track of the sum of all the numbers form 1 - 100
outside the for loop we square the sum of all numbers and subtract the singleSqured sum from that number to get our answer

Time Complexity - O(n) - This is because they are we have to go from 1 - 100 in a for looop
Space Complexity - O(1) - no new data structure is created so now space apart from storing single variables are used
 */
