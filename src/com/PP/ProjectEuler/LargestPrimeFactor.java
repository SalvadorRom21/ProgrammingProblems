/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
package com.PP.ProjectEuler;

import java.util.HashMap;
import java.util.Map;

public class LargestPrimeFactor {

    public static Long largetstPrime(Long number) {

        Long div = 2L;
        while(div<number){
            if(number % div != 0){
                div++;
            }else{
                number /= div;
                div = 2L;
            }
        }
        return div;
    }
}

/*
Solution -
if a number cannot be divided by another number it is a prime

we start with 2 since thats the first prime number and assign it to div variable

while div is smaller than number
we will check that number mod div isnt 0

if it is not then we add 1 to div to move on to the next number

if it is 0 that means that the number is divisable by div
so we divide it and store the value back to number;

we reset div to 2 and restart the process until it div is larger than num

return div at the end and that will be our prime number

 */
