/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package com.PP.ProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {

    public static void smallestMultiple(){
        int counter = 2521;
        outloop:
        while(counter < Integer.MAX_VALUE) {
            for (int i = 2; i<=20; i++) {
                if(counter % i != 0){
                    break;
                }
                if(i == 20){
                    System.out.println(counter);
                    break outloop;
                }
            }
            counter++;
        }
    }

}

/*
Solution
To solve this issue we will start by creating a loop that will run for
a large int number. Since we dont know the exact answer we will make it Integer.MAX_VALUE

We will have a counter that will keep count on what number we are on
We will have a for loop that checks if the number counter is divisible
by the numbers 2 to 20 (we start with 2 since all number are divisible by 1)
if at anypoint the number is not divisible by any of those numbers we will break out
and add 1 to counter and move on to the next number;

once we have reached a number that is divisible by all the number up to and including 20
we print it out and break out of the while loop to start the program... we have found the smallest
multiple

Time Complexity O(nlog(m)) Where n is the counter. since we dont reach 20 every time
m represents the for loop complexity.

Space Complexity O(1) - No new data structures are created.

 */
