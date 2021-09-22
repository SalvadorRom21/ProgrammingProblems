/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
package com.PP.ProjectEuler;

public class LargestPrimeFactor {

    public static Long largetstPrime(Long number) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 21, 37, 41, 43}

        int index = 0;
        int notOne = 0;
        while (notOne != 1){
            if(number % primes[index] != 0)
            number /= primes[index];
        }
    }
}
